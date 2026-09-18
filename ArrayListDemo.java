import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {

    public static void main(String[] args) {
        

        // How to create an arraylist

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        // adding values inside arraylist

        names.add("Mina");
        names.add("Abir");
        names.add("Rina");
        names.add("Sahrior");
        names.add("Afifa");

        //System.out.println("After adding values: " + names);


        // get element 

        String nameAt0thIndex = names.get(0);
        String nameAt2ndIndex = names.get(2);

        //System.out.println("0 th index name: " + nameAt0thIndex);
        //System.out.println("2nd index name: " + nameAt2ndIndex);


        // find index of an element

        int index = names.indexOf("Abir");

        //System.out.println("Index of Abir: "+ index);

        int index1 = names.indexOf("Mahit");
        
        //System.out.println("Index of mahit: " + index1);


        // contains

        // suppose you have a value , now how do you understand that value exist in the arraylist

        if (names.contains("Rina")){
            //System.out.println("Rina is present");
        }

        if(!names.contains("Mahit")){
            //System.out.println("Mahit is not present");
        }

        //System.out.println(names.contains("Mahit"));
        //System.out.println(names.contains("Afifa"));


        // How to remove an element from arraylist 

        //System.out.println("Before removing 2nd index value: " + names);

        names.remove(2);

        //System.out.println("After removing 2nd index value: " + names);


        // Add element in a specific position

        names.add(1, "string 4");

        //System.out.println(names);


        //how to change a value in arraylist

        //System.out.println("before changing: " + names);

        names.set(1, "string 5");

        //System.out.println("after changing: " + names);

        // how to find the size of arraylist

        int sizeOfNames = names.size();

        //System.out.println(sizeOfNames);

        // iterating arraylist using normal for loop

        //System.out.println("Using for loop: ");

        //for(int i = 0 ; i<names.size(); i++){
            //System.out.println( names.get(i) );
        //}


        // iterating using for each loop

        //System.out.println("Using for each loop: ");

        //for(String n : names){
          //  System.out.println(n);
        //}


        numbers.add(50);
        numbers.add(10);
        numbers.add(20);
        numbers.add(90);
        numbers.add(60);
        numbers.add(40);
        numbers.add(30);
        numbers.add(70);
        numbers.add(80);
        numbers.add(100);

        // sorting number in ascending order 

        //System.out.println("Before sorting: " + numbers);

        //Collections.sort( numbers );

        //System.out.println("After sorting: " + numbers);


        // sorting in descendin order

        //Collections.sort( numbers , Collections.reverseOrder() );

        //System.out.println("After sorting in reverse: " + numbers);

        ArrayList<String> arr = new ArrayList<>();

        arr.add("bu");
        arr.add("ac");
        arr.add("aa");
        arr.add("bc");

        //System.out.println("Before sorting: " + arr);

        Collections.sort(arr);

        //System.out.println("After sorting: "+ arr);

        //System.out.println(arr.size());

        // delete an arraylist

        arr.clear();

        //System.out.println(arr.size());

        ArrayList mixedArrayList = new ArrayList<>();

        mixedArrayList.add("afifa");
        mixedArrayList.add(67);
        mixedArrayList.add(5.80);
        mixedArrayList.add("sahrior");

        //System.out.println(mixedArrayList);


        //---------------------------- Arraylist of class type -----------------------

        ArrayList< Student > studentList = new ArrayList<>();

        studentList.add( new Student( 1, "Sahrior", 3.85 ) );
        studentList.add( new Student( 2, "Afifa", 3.95 ) );
        
        studentList.add( new Student( 3, "Mahit", 3.02 ) );
        studentList.add( new Student( 6, "abir", 3.32 ) );
        studentList.add( new Student( 4, "mahin", 2.20 ) );

        System.out.println("Before sorting: ");
        for(Student s : studentList){
            System.out.println(s);
        }

        // sort student by id

        /*Collections.sort( studentList, new Comparator<Student>(){

            public int compare ( Student o1, Student o2 ){
                return o1.id - o2.id;
            }

        });


        System.out.println("After sorting: ");
        for(Student s : studentList){
            System.out.println(s);
        }*/

        //sort student by name

        Collections.sort(studentList, new Comparator<Student>() {

            @Override 
            public int compare ( Student o1 , Student o2  ){

                return o1.name.compareTo( o2.name );

            }
            
        });


        /*System.out.println("After sorting: ");
        for(Student s : studentList){
            System.out.println(s);
        }*/

        // sort student base on cgpa

        Collections.sort(studentList, new Comparator<Student>() {
            
            public int compare ( Student o1 , Student o2 ){
                if( o1.cgpa > o2.cgpa ){
                    return 1;
                }
                return -1;
            }


        });

        System.out.println("After sorting: ");
        for(Student s : studentList){
            System.out.println(s);
        }








        





    }
    
}


// Student class

class Student{

    public int id;
    public String name;
    public double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override 
    public String toString(){
        return "[ name: " + name + "," + " id: " + id +  "," + " cgpa: " + cgpa +  "]";
    }


}
