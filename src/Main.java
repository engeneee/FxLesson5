import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;



//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> enhypen = new ArrayList<String>();
//        enhypen.add("Heeseung");
//        enhypen.add("Jay");
//        enhypen.add("Jake");
//        enhypen.add("Sunghoon");
//        enhypen.add("Sunoo");
//        enhypen.add("Jungwon");
//        enhypen.add("Ni-ki");
//        System.out.println(enhypen);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> enhypen = new ArrayList<String>();
//        enhypen.add("Heeseung");
//        enhypen.add("Jay");
//        enhypen.add("Jake");
//        enhypen.add("Sunghoon");
//        enhypen.add("Sunoo");
//        enhypen.add("Jungwon");
//        enhypen.add("Ni-ki");
//        for (int i = 0; i < enhypen.size(); i++){
//            System.out.println(enhypen.get(i));
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> enhypen = new ArrayList<String>();
//        enhypen.add("Heeseung");
//        enhypen.add("Jay");
//        enhypen.add("Jake");
//        enhypen.add("Sunghoon");
//        enhypen.add("Sunoo");
//        enhypen.add("Jungwon");
//        enhypen.add("Ni-ki");
//        for (String i : enhypen){
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> famAges = new ArrayList<Integer>();
//        famAges.add(39);
//        famAges.add(39);
//        famAges.add(19);
//        famAges.add(17);
//        famAges.add(14);
//        famAges.add(10);
//        famAges.add(2);
//        for (int i : famAges){
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> TXT = new ArrayList<String>();
//        TXT.add("Yeonjun");
//        TXT.add("Soobin");
//        TXT.add("Beomgyu");
//        TXT.add("Taehyun");
//        TXT.add("Huening");
//        Collections.sort(TXT);
//        for (String i : TXT){
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> GirlsBdays = new ArrayList<Integer>();
//        GirlsBdays.add(12);
//        GirlsBdays.add(22);
//        GirlsBdays.add(15);
//        GirlsBdays.add(26);
//        GirlsBdays.add(27);
//        Collections.sort(GirlsBdays);
//        for (int i : GirlsBdays){
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> ChickenChu = new ArrayList<String>();
//        ChickenChu.add("Damir");
//        ChickenChu.add("Merei");
//        ChickenChu.add("Amina");
//        ChickenChu.add("Nurzat");
//        ChickenChu.add("Ansar");
//        ChickenChu.add("Zhuldyzai");
//        System.out.println(ChickenChu);
//
//        String ChickenChuu = ChickenChu.get(0);
//        System.out.println("get method:" +ChickenChuu);
//
//        ChickenChu.set(0,"Adilkhan");
//        System.out.println("set method:" +ChickenChu);
//
//        ChickenChu.remove(2);
//        System.out.println("remove method:" +ChickenChu);
//
//        ChickenChu.clear();
//        System.out.println("clear method:" +ChickenChu);
//
//        int s = ChickenChu.size();
//        System.out.println("list size" +s);
//
//    }
//}

//Problem 1
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Purple");
//        colors.add("Pink");
//        colors.add("White");
//        colors.add("Gray");
//        colors.add("Yellow");
//        Collections.sort(colors);
//        for (String i : colors){
//            System.out.println(i);
//        }
//    }
//}

//Problem 2
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Purple");
//        colors.add("Pink");
//        colors.add("White");
//        colors.add("Gray");
//        colors.add("Yellow");
//        colors.set(0,"Black");
//        System.out.println(colors);
//
//    }
//}

//Problem 3
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Purple");
//        colors.add("Pink");
//        colors.add("White");
//        colors.add("Gray");
//        colors.add("Yellow");
//        String color = colors.get(2);
//        System.out.println(color);

//Problem 4
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Purple");
//        colors.add("Pink");
//        colors.add("White");
//        colors.add("Gray");
//        colors.add("Yellow");
//        System.out.println(colors);
//        colors.set(2, "Black");
//        System.out.println(colors);
//    }
//}


//Problem 5
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Purple");
//        colors.add("Pink");
//        colors.add("White");
//        colors.add("Gray");
//        colors.add("Yellow");
//        colors.remove(3);
//        System.out.println(colors);
//    }
//}

//Problem 6
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Purple");
//        colors.add("Pink");
//        colors.add("White");
//        colors.add("Gray");
//        colors.add("Yellow");
//        String color = colors.get(0);
//        System.out.println(color);
//    }
//}

//Problem 7
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> Surnames = new ArrayList<String>();
//        Surnames.add("Yang");
//        Surnames.add("Kan");
//        Surnames.add("Min");
//        Surnames.add("Park");
//        System.out.println("List1: " + Surnames);
//        ArrayList<String> Names = new ArrayList<String>();
//        Names.add("Jungwon");
//        Names.add("Taehyun");
//        Names.add("Yoongi");
//        Names.add("Rose");
//        System.out.println("List2: " + Names);
//        Collections.copy(Surnames, Names);
//        System.out.println("After copy:");
//        System.out.println("List1: " + Surnames);
//        System.out.println("List2: " + Names);
//    }
//}

//Problem 8
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> BTS = new ArrayList<String>();
//        BTS.add("Namjoon");
//        BTS.add("Yoongi");
//        BTS.add("Sokjin");
//        BTS.add("Jimin");
//        BTS.add("Taehyung");
//        System.out.println(BTS);
//        Collections.shuffle(BTS);
//        System.out.println(BTS);
//    }
//}

//Problem 9
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> BTS = new ArrayList<String>();
//        BTS.add("Namjoon");
//        BTS.add("Yoongi");
//        BTS.add("Sokjin");
//        BTS.add("Jimin");
//        BTS.add("Taehyung");
//        System.out.println(BTS);
//        Collections.reverse(BTS);
//        System.out.println(BTS);
//    }
//}

//Bonus
//public class Main {
//    public static void main(String[] args) {
//        List<String> Students = new ArrayList<String>();
//        Students.add("Yuki");
//        Students.add("Nurik");
//        Students.add("Ers");
//        Students.add("Assem");
//        Students.add("Dina");
//        System.out.println(Students);
//        List<String> Boys = Students.subList(1, 3);
//        System.out.println(Boys);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> JataGirls= new ArrayList<String>();
//        JataGirls.add("Merei");
//        JataGirls.add("Dina");
//        JataGirls.add("Yuki");
//        JataGirls.add("Aizh");
//
//        ArrayList<String> JataGirls2= new ArrayList<String>();
//        JataGirls2.add("Merei");
//        JataGirls2.add("Dina");
//        ArrayList<String> c3 = new ArrayList<String>();
//        for (String e : JataGirls)
//            c3.add(JataGirls2.contains(e) ? "Yes" : "No");
//        System.out.println(c3);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> Teachers= new ArrayList<String>();
//        Teachers.add("MyktyBaha");
//        Teachers.add("Kazangapov");
//        Teachers.add("Uldai");
//        Teachers.add("Ernar");
//        Teachers.add("Arailym");
//        for(String a: Teachers){
//            System.out.println(a);
//        }
//        Collections.swap(Teachers, 0, 4);
//        for(String b: Teachers){
//            System.out.println(b);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> Web= new ArrayList<String>();
//        Web.add("Assem");
//        Web.add("Dina");
//        Web.add("Akena");
//        Web.add("Aidyn");
//        Web.add("Daryn");
//        System.out.println("List of first array: " + Web);
//        ArrayList<String> Android= new ArrayList<String>();
//        Android.add("Madi");
//        Android.add("Daniyar");
//        Android.add("Alnur");
//        Android.add("Merei");
//        Android.add("Ulbosh");
//        Android.add("Aizh");
//        Android.add("Yuki");
//        System.out.println("List of second array: " + Android);
//        ArrayList<String> a = new ArrayList<String>();
//        a.addAll(Web);
//        a.addAll(Android);
//        System.out.println("New array: " + a);
//    }
//}