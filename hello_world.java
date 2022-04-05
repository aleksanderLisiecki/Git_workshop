// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 


        Robot robot = new Robot();

        robot.makeAction();
        robot.makeNoice();
    }
}

class Robot{

        void makeAction(){
                System.out.println("I just turned!!!");
                System.out.println("and moved");
                System.out.println("and rolled");
                
                System.out.println("and thats it");
        }

        void makeNoice(){
                System.out.println("Bark!");
		System.out.println("Chyba ty");
		System.out.println("jednak nie ja");
		System.out.println("to kto");

        }
}