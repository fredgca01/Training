package general;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import general.DataStruct.Day;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStream();
		
	}
	
	public static void testStream(){
		StreamTest stream = new StreamTest();
		stream.testStreamWithAirport();
	}
	
	@SuppressWarnings("deprecation")
	public static void testAnnotation(){
		DataStruct.testDeprecated();
	}
	
	public static void testDataStruct(){
		DataStruct<String> test = new DataStruct<String>();
		test.testgenerique("Coucou");
		DataStruct<List> test2 = new DataStruct<List>();
		test2.testgenerique(new ArrayList<>());
		
		test2.testEnum(Day.FRIDAY);
	}
	
	public static void testfileReader(){
		FileReadertest file = new FileReadertest();
		file.readfileinline();
	}
	
	public static void testregexp(){
		String data = "10,\"Thule Air Base\",\"Thule\",\"Greenland\",\"THU\",\"BGTL\",76.531203,-68.703161,251,-4,\"E\",\"America/Thule\"";
		RegexpTraining train = new RegexpTraining();
		train.testGroup();
	}
	
	public static void testLoop(){
		ArrayListMethods.testLoop();
		
		String[] data = {"Paris", "Rotterdam", "Amsterdam", "Rennes", "Caen", "Moscow", "Bamako", "Toulouse"};
		String result=null;
		for (String city : data){
			if(result==null || city.length()<result.length())
				result=city;
		}
		System.out.println(result);
	}
	
	
	public static void test1() {
		// Write a program that will print the word Udacity in a box
		// so that it looks exactly like the figure below. Name the program NameInBox

		// +-------+
		// |Udacity|
		// +-------+ 
		//
		String name= "udacity";
		int length = name.length();
		name = "|".concat(name).concat("|");

		String resultToPrint="";
		for (int i=0;i<length;i++){
			resultToPrint=resultToPrint+"-";
		}
		resultToPrint = "+".concat(resultToPrint).concat("+");
		System.out.println(resultToPrint);
		System.out.println(name);
		System.out.println(resultToPrint);
	}
	
	public static void test2() {
		// Write the code to draw a tower of blocks that looks like the one in the link below:
		// http://i.imgur.com/PvIGJkL.png
		    
		// Name the class BlockTower. Each block has a width of 40 and a height of 30. 
		// There are three rows. The upper left-hand corner of the bottom row is at (20, 70)

		// Create a custom color for the topmost color where red = 125, green=125, blue = 255. 
		// For all the other colors, use predefined colors. 
		// The colors from top to bottom are: custom, RED, PINK, BLUE, MAGENTA, CYAN


		// HINT:
		// The bottom left rectangle should have the attributes:
		// x: 20
		// y: 70
		// width: 40
		// height: 30
		//
		// You should set the color of the rectangle to blue by using the method:
		// setColor(Color.somecolor); on the rectangle object that you created
		//
		// Don't forget to draw the rectangle by calling the fill() function
		
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Draw Rectangle");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.add(new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        //
                        // Draw a rectangle using Rectangle2D class
                        //
                        double initX=200;
                        double initY=70;
                    	double x = initX;
                        double y = initY;
                        double width = 40;
                        double height = 30;
                        List<Color> colors = new ArrayList<Color>();
                        colors.add(Color.RED);
                        colors.add(Color.BLUE);
                        colors.add(Color.GREEN);
                        
                        Graphics2D g2 = (Graphics2D) g;
                        
                        for (int i=0; i<3; i++){
                        	for (int j=0;j<=i;j++){
                        		Rectangle2D rect = drawBlock(x, y, width, height);
                        		g2.setColor(colors.get(j));
                        		g2.fill(rect);
                        		g2.draw(rect);
                        		x=x+width;
                        	}
                        	x=initX-width/(2-i)+1;
                        	y=y+height;
                        }
                        
                    }
                }, BorderLayout.CENTER);

                frame.pack();
                frame.setSize(new Dimension(500, 400));
                frame.setVisible(true);
            }
        });
	}
	
	public static Rectangle2D drawBlock(double x, double y, double width, double height) {
		Rectangle2D rect = new Rectangle2D.Double(x, y, width, height);        	
		return rect;
	}
	
	public static void creditCardTester () {
		CreditCard visa =new CreditCard();
        System.out.println(visa.getBalance());
        System.out.println("Expected: 0.0");
        
        visa.payment(10.50);
        visa.payment(2.99);
        System.out.println(visa.getBalance());
        System.out.println("Expected: 13.49");
        
        visa.purchase(5.0);
        visa.purchase(5);
        System.out.println(visa.getBalance());
        System.out.println("Expected: 3.49");
	}
	
	public static void ArrayListMethodTester() {
		//set up
        ArrayList<String> animals = new ArrayList<String>();
        ArrayListMethods zoo = new ArrayListMethods(animals); 
        zoo.list.add("ape");
        zoo.list.add("dog");
        zoo.list.add("zebra");
        
        //test isSorted
        System.out.println(zoo.isSorted());
        System.out.println("test isSorted, Expected: true");
        
        zoo.list.add("cat");
        System.out.println(zoo.isSorted());
        System.out.println("test isSorted, Expected: false");
        
        zoo.list.remove("cat");
        zoo.list.add(0,"cat");
        System.out.println(zoo.isSorted());
        System.out.println("test isSorted, Expected: false");
        
        
        
        zoo.list.add(3,"horse");
        
        //test replaceWithLargerNeighbor
        zoo.replaceWithLargerNeighbor();
        System.out.println(zoo.toString());
        System.out.println("replaceWithLargerNeighbor, Expected: [cat, dog, horse, zebra, zebra]");
        
        zoo.list.add(0,"cat");
        
        //test count duplicates;
        System.out.println(zoo.countDuplicates());
        System.out.println("countDuplicates, Expected: 2");
        zoo.list.add(4,"dog");
        System.out.println(zoo.countDuplicates());
        System.out.println("countDuplicates, Expected: 3");
        
        
        //start with fresh array list
        animals = new ArrayList<String>();
        zoo = new ArrayListMethods(animals); 
        
        //does empty array list work?
         System.out.println(zoo.isSorted());
         System.out.println("isSorted, Expected: true");
         zoo.replaceWithLargerNeighbor();
         System.out.println(zoo.toString());
         System.out.println("replaceWithLargerNeighbor, Expected: []");
         System.out.println(zoo.countDuplicates());
         System.out.println("countDuplicates, Expected: 0");
        
        //test xyzToFront
        zoo.list.add("ape");
        zoo.list.add("dog");
        zoo.list.add("xantus");
        zoo.list.add("zebra");
        zoo.list.add("cat");
        zoo.list.add("yak");
        
        zoo.xyzToFront();
        System.out.println(zoo.toString());
        System.out.println("Expected: [xantus, zebra, yak, ape, dog, cat]");
	}
	

}
