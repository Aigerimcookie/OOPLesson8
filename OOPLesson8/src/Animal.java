public class Animal {

    void voiceAnimal(){
        System.out.println("nyamnyam...");
    }
}

class Cat extends Animal{

    void voiceCat(){
        System.out.println("mau...");

    }
        }

        class Dog extends Animal{

    void voiceDog (){
        System.out.println("bark..");

        }
    }

        class Test{
            public static void main(String[] args) {
                Dog d = new Dog ();
                d.voiceDog();
                d.voiceAnimal();

            }
        }