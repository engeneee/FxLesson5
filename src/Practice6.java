import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Student {
//   String title;
//    int ages;
//    long phoneNumber;
//    int grades;
//
//    public Student(String title, int ages, long phoneNumber, int grades) {
//        this.title = title;
//        this.ages = ages;
//        this.phoneNumber = phoneNumber;
//       this.grades = grades;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getAges() {
//       return ages;
//    }
//
//    public void setAges(int i) {
//       this.ages = ages;
//    }
//
//    public long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public int getGrades() {
//        return grades;
//    }
//
//    public void setGrades(int grades) {
//        this.grades = grades;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "title='" + title + '\'' +
//                ", ages=" + ages +
//                ", phoneNumber=" + phoneNumber +
//                ", grades=" + grades +
//                '}';
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Student student = new Student("Aya", 19, 87755730209, 99);
//        System.out.println(student.getTitle());
//
//        System.out.println("Old info: " + student);
//
//        student.setTitle("Yuki");
//        student.setAges(17);
//        student.setPhoneNumber(87029242694);
//        student.setGrades(98);
//        System.out.println(student);
//    }
//}
//
//

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        Student student = new Student("Ulbosh", 17, 87475667809L, 99);
//        Student student2 = new Student("Assem", 18, 87477429393L, 98);
//        Student student3 = new Student("Aizh", 17, 87053789203L, 95);
//
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        System.out.println("Old list: " +studentArrayList);
//
//        System.out.println(studentArrayList.get(0));
//        Collections.sort(studentArrayList, new SortByAge());
//        System.out.println("Sorted by age: " +studentArrayList);
//    }
//}
//

//class SortByAge implements Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getAges() == s2.getAges()) //equal
//            return 0;
//        if (s1.getAges() > s2.getAges())
//            return 1; // bigger
//        else
//            return -1; // smaller
//    }
//}
//
//class SortByGrade implements Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getGrades() == s2.getGrades()) //equal
//            return 0;
//        if (s1.getGrades() > s2.getGrades())
//            return 1; // bigger
//        else
//            return -1; // smaller
//    }
//}
//
//class SortByName implements  Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2){
//        return s1.getTitle().compareTo(s2.getTitle());
//    }
//}
//
//

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        Student student = new Student("Aizh", 17, 87089975678L, 89);
//        Student student2 = new Student("Aliya", 20, 87478890909L, 70);
//        Student student3 = new Student("Merei", 18, 87071234567L, 99);
//
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        System.out.println("Old list: " + studentArrayList);
//
//        Student s = getStudentByAge(studentArrayList, 18);
//        System.out.println(s);
//    }
//
//    public static Student getStudentByAge(ArrayList<Student> list, int age) {
//        Student res = null;
//        for (Student s : list) {
//           if (s.getAges() == age) {
//               res = s;
//           }
//       }
//        return res;
//   }
//}

//Problem 1
//class Student {
//        String name;
//        String surname;
//        String lastname;
//        int data;
//        String adress;
//        long phoneNumber;
//        String faculty;
//        int course;
//        String group;
//
//    public Student(String name,  String surname, String lastname, int data, String adress, long phoneNumber, String faculty, int course, String group) {
//        this.name = name;
//        this.surname = surname;
//        this.lastname = lastname;
//        this.adress = adress;
//        this.data = data;
//        this.phoneNumber = phoneNumber;
//        this.faculty = faculty;
//        this.group = group;
//        this.course = course;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//        public String getSurname() {
//                return surname;
//        }
//
//        public void setSurname(String surname) {
//                this.surname = surname;
//        }
//
//        public String getAdress() {
//                return adress;
//        }
//
//        public void setAdress(String adress) {
//                this.adress = adress;
//        }
//    public String getFaculty() {
//        return faculty;
//    }
//
//    public void setFaculty(String faculty) {
//        this.faculty = faculty;
//    }
//
//    public int getData() {
//       return data;
//    }
//
//    public void setData(int i) {
//       this.data = data;
//    }
//
//    public long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "surname='" + surname + '\'' +
//                "name='" + name + '\'' +
//                "lastname='" + lastname + '\'' +
//                ",data =" + data +
//                " adress='" + adress + '\'' +
//                ", phoneNumber=" + phoneNumber +
//                "faculty='" + faculty + '\'' +
//                ", course=" + course +
//                " group='" + group + '\'' +
//                '}';
//    }
//}
//
//public class Practice6 {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        Student student = new Student("Assem", "Shimbergenova", "Ahatkyzy", 2003, "Elibaeva 26a", 87057339333L, "Ravenclaw", 3, "E");
//        Student student2 = new Student("Zhuldyzai", "Rashid", "Kuanyshkyzy", 2005, "Konayeva 6", 87029242694L, "Hufflepuff", 3, "H");
//        Student student3 = new Student("Aizhan", "Zhumashova", "Kurmashevna", 2001, "15 mkr", 87052201919L, "Slytherin", 3, "U");
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        Student s = getStudentByFaculty(studentArrayList, "Slytherin");
//        System.out.println(s);
//        System.out.println(studentArrayList);
//        Student r = getStudentByData(studentArrayList, 2003);
//        System.out.println(r);
//        Student g = getStudentByGroup(studentArrayList, "E");
//        System.out.println(g);
//    }
//        public static Student getStudentByFaculty(ArrayList<Student> list, String faculty) {
//        Student res = null;
//        for (Student s : list) {
//           if (s.getFaculty() == "Slytherin") {
//               res = s;
//           }
//       }
//        return res;
//   }
//        public static Student getStudentByData(ArrayList<Student> list, int age) {
//        Student res = null;
//        for (Student r : list) {
//           if (r.getData() >= 2003) {
//               res = r;
//           }
//       }
//        return res;
//   }
//    public static Student getStudentByGroup(ArrayList<Student> list, String group) {
//        Student res = null;
//        for (Student g : list) {
//            if (g.getGroup() == "E") {
//                res = g;
//            }
//        }
//        return res;
//    }
//}

//Problem 2
//class Student {
//        String name;
//        String surname;
//        String lastname;
//        String adress;
//        int card;
//
//        long BankCard;
//
//
//    public Student(String name,  String surname, String lastname, int card, String adress, long BankCard) {
//        this.name = name;
//        this.surname = surname;
//        this.lastname = lastname;
//        this.adress = adress;
//        this.BankCard = BankCard;
//        this.card = card;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//        public String getSurname() {
//                return surname;
//        }
//
//        public void setSurname(String surname) {
//                this.surname = surname;
//        }
//
//        public String getAdress() {
//                return adress;
//        }
//
//        public void setAdress(String adress) {
//                this.adress = adress;
//        }
//
//    public int getCard() {
//       return card;
//    }
//
//    public void setCard(int i) {
//       this.card = card;
//    }
//
//    public long getBankCard() {
//        return BankCard;
//    }
//
//    public void setBankCard(long BankCard) {
//        this.BankCard = BankCard;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "surname='" + surname + '\'' +
//                "name='" + name + '\'' +
//                "lastname='" + lastname + '\'' +
//                " adress='" + surname + '\'' +
//                ",card =" + card +
//                ", BankCard=" + BankCard;
//    }
//}
//
//public class Practice6 {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        Student student = new Student("Ayaulym", "Rashidova", "Kuanyshkyzy", 12345, "Konayeva 6", 4455667788L);
//        Student student2 = new Student("Altynai", "Mukashova", "Azimkhanovna", 45673, "1-33-85", 46372924343L);
//        Student student3 = new Student("Kuanysh", "Koishybayev", "Rashidovich", 75643, "Zhanatas town", 2853485467L);
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        System.out.println(studentArrayList.get(0));
//        Collections.sort(studentArrayList, new SortByName());
//        System.out.println("Sorted by name: " +studentArrayList);
//
//        System.out.println(studentArrayList.get(0));
//        Collections.sort(studentArrayList, new SortByCard());
//        System.out.println("Sorted by card: " +studentArrayList);
//    }
//}
//class SortByName implements  Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2){
//        return s1.getName().compareTo(s2.getName());
//    }
//}
//
//class SortByCard implements Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getCard() == s2.getCard()) //equal
//            return 0;
//        if (s1.getCard() > s2.getCard())
//            return 1; // bigger
//        else
//            return -1; // smaller
//    }
//}

//Problem 3
//class Patient {
//        String name;
//        String surname;
//        String lastname;
//        long phonenumber;
//        String adress;
//        long medicinecard;
//        String diagnosis;
//
//    public Patient(String name,  String surname, String lastname, long phonenumber, String adress, long medicinecard, String diagnosis) {
//        this.name = name;
//        this.surname = surname;
//        this.lastname = lastname;
//        this.adress = adress;
//        this.phonenumber = phonenumber;
//        this.medicinecard = medicinecard;
//        this.diagnosis = diagnosis;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//        public String getSurname() {
//                return surname;
//        }
//
//        public void setSurname(String surname) {
//                this.surname = surname;
//        }
//
//        public String getAdress() {
//                return adress;
//        }
//
//        public void setAdress(String adress) {
//                this.adress = adress;
//        }
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(String diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//
//
//    public long getPhonenumber() {
//        return phonenumber;
//    }
//
//    public void setPhonenumber(long phoneNumber) {
//        this.phonenumber = phoneNumber;
//    }
//
//    public long getMedicinecard() {
//        return medicinecard;
//    }
//
//    public void setMedicinecard(long medicinecard) {
//        this.medicinecard = medicinecard;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient{" +
//                "surname='" + surname + '\'' +
//                "name='" + name + '\'' +
//                "lastname='" + lastname + '\'' +
//                " adress='" + adress + '\'' +
//                ", phoneNumber=" + phonenumber +
//                " medicinecard='" + medicinecard + '\'' +
//                ", diagnosis=" + diagnosis ;
//    }
//}
//
//public class Practice6 {
//    public static void main(String[] args) {
//        ArrayList<Patient> patientArrayList = new ArrayList<>();
//        Patient patient = new Patient("Aigerim", "Aibayeva", "Ahatkyzy", 87774563289L, "Elibaeva 26a", 45,  "Corona");
//        Patient patient1 = new Patient("Asel", "Rysbekova", "Zhambylkyzy", 87028467323L, "Konayeva 6", 23,  "Bronhit");
//        Patient patient2 = new Patient("Aya", "Agadilova", "Kurmashevna", 87475678900L, "15 mkr", 11, "Epilepsiya");
//        patientArrayList.add(patient);
//        patientArrayList.add(patient1);
//        patientArrayList.add(patient2);
//        Patient s = getPatientByDiagnosis(patientArrayList, "Corona");
//        System.out.println(s);
//        Patient r = getPatientByMedicinecard(patientArrayList, 20);
//        System.out.println(r);
//    }
//        public static Patient getPatientByDiagnosis(ArrayList<Patient> list, String diagnosis) {
//        Patient res = null;
//        for (Patient s : list) {
//           if (s.getDiagnosis() == "Corona") {
//               res = s;
//           }
//       }
//        return res;
//   }
//   public static Patient getPatientByMedicinecard(ArrayList<Patient> list, int medicinecard) {
//        Patient res = null;
//
//        for (Patient r : list) {
//           if (r.getMedicinecard() >= 20) {
//               res = r;
//           }
//       }
//        return res;
//   }
//}

//Problem 4
//class Student {
//        String name;
//        String surname;
//        String lastname;
//        String adress;
//        int marks;
//
//        long phonenumber;
//
//
//    public Student(String name,  String surname, String lastname, String adress, int marks, long phonenumber) {
//        this.name = name;
//        this.surname = surname;
//        this.lastname = lastname;
//        this.adress = adress;
//        this.marks = marks;
//        this.phonenumber = phonenumber;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//        public String getSurname() {
//                return surname;
//        }
//
//        public void setSurname(String surname) {
//                this.surname = surname;
//        }
//
//        public String getAdress() {
//                return adress;
//        }
//
//        public void setAdress(String adress) {
//                this.adress = adress;
//        }
//
//    public int getMarks() {
//       return marks;
//    }
//
//    public void setMarks(int i) {
//       this.marks = marks;
//    }
//
//    public long getPhonenumber() {
//        return phonenumber;
//    }
//
//    public void setPhonenumber(long phonenumber) {
//        this.phonenumber = phonenumber;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "surname='" + surname + '\'' +
//                "name='" + name + '\'' +
//                "lastname='" + lastname + '\'' +
//                " adress='" + surname + '\'' +
//                ",marks =" + marks +
//                ", phonenumber=" + phonenumber;
//    }
//}

//public class Practice6 {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        Student student = new Student("Zhomart", "Aldabai", "Rashidovich", "Pushkina 154", 97, 2853485467L);
//        Student student2 = new Student("Aruzhan", "Tolegen", "Azimkhanovna", "Krasnaya zvezda", 82, 87755730209L);
//        Student student3 = new Student("Zhuldyzai", "Rashid", "Kuanyshkyzy", "Konayeva 6", 67, 87029242694L);
//        studentArrayList.add(student);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//
//        Collections.sort(studentArrayList, new SortByMarks());
//        System.out.println(studentArrayList);
//        Student r = getStudentByMarks(studentArrayList, 67);
//        System.out.println(r);
//        Student a = getStudentByMarks(studentArrayList, 90);
//        System.out.println(a);
//    }
//    public static Student getStudentByMarks(ArrayList<Student> list, int marks) {
//        Student res = null;
//
//        for (Student r : list) {
//           if (r.getMarks() <= 70) {
//               res = r;
//           }
//       }
//        return res;
//   }

//    public static Student getStudentByMarks(ArrayList<Student> list, int marks) {
//        Student res = null;
//
//        for (Student a : list) {
//            if (a.getMarks() >= 90) {
//                res = a;
//            }
//        }
//        return res;
//    }
//}
//class SortByMarks implements Comparator<Student> {
//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getMarks() == s2.getMarks()) //equal
//            return 0;
//        if (s1.getMarks() > s2.getMarks())
//            return 1; // bigger
//        else
//            return -1; // smaller
//    }
//}

//Problem 5
//class Book {
//        String title;
//        String author;
//        String publish;
//        int year;
//        int pages;
//        int price;
//        String tip;
//
//
//    public Book(String title,  String author, String publish, int year, int pages, int price, String tip) {
//        this.title = title;
//        this.author = author;
//        this.publish = publish;
//        this.year = year;
//        this.pages = pages;
//        this.price = price;
//        this.tip = tip;
//
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublish() {
//        return publish;
//    }
//
//    public void setPublish(String publish) {
//        this.publish = publish;
//    }
//    public String getTip() {
//        return tip;
//    }
//
//    public void setTip(String tip) {
//        this.tip = tip;
//    }
//
//    public int getPages() {
//       return pages;
//    }
//
//    public void setPages(int i) {
//       this.pages = pages;
//    }
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int i) {
//        this.year = year;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int i) {
//       this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Books{" +
//                "Title='" + title + '\'' +
//                "Author='" + author + '\'' +
//                "Publish='" + publish + '\'' +
//                " Year of publishing='" + year + '\'' +
//                ",Pages =" + pages +
//                ", Price=" + price +
//                ", Tip=" + tip;
//    }
//}
//
//public class Practice6 {
//    public static void main(String[] args) {
//        ArrayList<Book> bookArrayList = new ArrayList<>();
//        Book book = new Book("They both die at the end", "Adam Silvera", "Kirkus", 2017, 300, 4500, "tverdyi");
//        Book book2 = new Book("Jane Eyre", "Charlotte Bronte", "Enhypen", 1980, 620, 2000, "myagki");
//        Book book3 = new Book("Polianna", "Eleanor Porter", "Glad Books", 1913, 350, 3200, "myagki");
//        bookArrayList.add(book);
//        bookArrayList.add(book2);
//        bookArrayList.add(book3);
//        Book r = getBookByYear(bookArrayList, 2000);
//        System.out.println(r);

//        Book s = getBookByAuthor(bookArrayList, "Adam Silvera");
//        System.out.println(s);
//        Book p = getTitleByPublish(bookArrayList, "Enhypen");
//        System.out.println(p);
//    }


//        public static Book getBookByAuthor(ArrayList<Book> list, String author) {
//        Book res = null;
//        for (Book s : list) {
//           if (s.getAuthor() == "Adam Silvera") {
//               res = s;
//           }
//       }
//        return res;
//   }

//    public static Book getTitleByPublish(ArrayList<Book> list, String publish) {
//        Book res = null;
//        for (Book p : list) {
//            if (p.getPublish() == "Enhypen") {
//                res = p;
//            }
//        }
//        return res;
//    }
//}
//    public static Book getBookByYear(ArrayList<Book> list, int year) {
//        Book res = null;
//
//        for (Book r : list) {
//           if (r.getYear() >= 2000) {
//               res = r;
//           }
//       }
//        return res;
//   }
//}

//Problem 6
//class Kvartira {
//        int number;
//        int ploshad;
//        int etazh;
//        int komnat;
//        String street;
//        String zdanie;
//        int srok;
//
//
//    public Kvartira(int number, int ploshad, int etazh, int komnat, String street, String zdanie, int srok) {
//        this.number = number;
//        this.ploshad = ploshad;
//        this.etazh = etazh;
//        this.komnat = komnat;
//        this.street = street;
//        this.zdanie = zdanie;
//        this.srok = srok;
//
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getZdanie() {
//        return zdanie;
//    }
//
//    public void setZdanie(String zdanie) {
//        this.zdanie = zdanie;
//    }
//
//    public int getNumber() {
//       return number;
//    }
//
//    public void setNumber(int i) {
//       this.number = number;
//    }
//    public int getPloshad() {
//        return ploshad;
//    }
//
//    public void setPloshad(int i) {
//        this.ploshad = ploshad;
//    }
//
//    public int getEtazh() {
//        return etazh;
//    }
//
//    public void setEtazh(int i) {
//       this.etazh = etazh;
//    }
//            public int getKomnat() {
//        return komnat;
//    }
//
//    public void setKomnat(int i) {
//       this.etazh = komnat;
//    }
//            public int getSrok() {
//        return srok;
//    }
//
//    public void setSrok(int i) {
//       this.srok = srok;
//    }
//
//    @Override
//    public String toString() {
//        return "Kvartira{" +
//                "Number='" + number + '\'' +
//                "Ploshad='" + ploshad + '\'' +
//                "Etazh='" + etazh + '\'' +
//                " Komnat='" + komnat + '\'' +
//                ",Street =" + street +
//                ", Zdanie=" + zdanie +
//                ", Srok=" + srok;
//    }
//}

//public class Practice6 {
//    public static void main(String[] args) {
//        ArrayList<Kvartira> kvartiraArrayList = new ArrayList<>();
//        Kvartira kvartira = new Kvartira(40, 25, 5, 3, "Konayeva", "Stalinka", 20);
//        Kvartira kvartira2 = new Kvartira(2, 60, 1, 2, "Suleimanova", "Hrushevka", 15);
//        Kvartira kvartira3 = new Kvartira(33, 45, 3, 1, "Furmanova", "Leninka", 10);
//        kvartiraArrayList.add(kvartira);
//        kvartiraArrayList.add(kvartira2);
//        kvartiraArrayList.add(kvartira3);
//        Kvartira r = getKvartiraByKomnaty(kvartiraArrayList);
//        System.out.println(r);
//        Kvartira e = getKvartiraByKomnaty(kvartiraArrayList);
//        System.out.println(e);
//        Kvartira p = getKvartiraByPloshad(kvartiraArrayList);
//        System.out.println(p);
//    }
//    public static Kvartira getKvartiraByKomnaty(ArrayList<Kvartira> list) {
//        Kvartira res = null;
//
//        for (Kvartira r : list) {
//            if (r.getKomnat() == 2) {
//                res = r;
//            }
//        }
//        for (Kvartira e : list) {
//            if (e.getEtazh() >= 1) {
//                res = e;
//            }
//        }
//        return res;
//    }

//    public static Kvartira getKvartiraByPloshad(ArrayList<Kvartira> list) {
//        Kvartira res = null;
//
//        for (Kvartira p : list) {
//            if (p.getPloshad() == 60) {
//                res = p;
//            }
//        }
//        return res;
//    }
//}

//Problem 7
//class Credit {
//    String surname;
//    String name;
//    String lastname;
//    String adress;
//    long creditCard;
//    int time;
//
//
//
//    public Credit(String surname, String name, String lastname, String adress, long creditCard, int time) {
//        this.surname = surname;
//        this.name = name;
//        this.lastname = lastname;
//        this.adress = adress;
//        this.creditCard = creditCard;
//        this.time = time;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//
//    public long getCreditCard() {
//        return creditCard;
//    }
//
//    public void setCreditCard(int i) {
//        this.creditCard = creditCard;
//    }
//
//    public int getTime() {
//        return time;
//    }
//
//    public void setTime(int i) {
//       this.time = time;
//    }
//
//    @Override
//    public String toString() {
//        return "Credit{" +
//                "Surname='" + surname + '\'' +
//                "Name='" + name + '\'' +
//                "Lastname='" + lastname + '\'' +
//                " Adress='" + adress + '\'' +
//                ",CreditCard =" + creditCard +
//                ", Time=" + time;
//    }
//}
//
//public class Practice6 {
//    public static void main(String[] args) {
//        ArrayList<Credit> creditArrayList = new ArrayList<>();
//        Credit credit = new Credit("Mukashova", "Altynai", "Azimkhanovna", "1-33-85", 44555667799L, 50);
//        Credit credit2 = new Credit("Shimbergenova", "Assem", "Ahatkyzy", "Taiwan", 44553388223L,20);
//        Credit credit3 = new Credit("Konayev", "Dimash", "Akhmetuly", "Kordai", 442233557788L, 10);
//        creditArrayList.add(credit);
//        creditArrayList.add(credit2);
//        creditArrayList.add(credit3);
//        Credit p = getNameByTime(creditArrayList);
//        System.out.println(p);
//    }
//        public static Credit getNameByTime(ArrayList<Credit> list) {
//        Credit res = null;
//
//        for (Credit p : list) {
//            if (p.getTime() == 20) {
//                res = p;
//            }
//        }
//        return res;
//    }
//}












