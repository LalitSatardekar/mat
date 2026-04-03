// 1. Dart - Classes And Objects

class hello
{
  String helloworld = 'This is Dart Programming';
  void hellofunction()
  {
    print("Hello World");
  }
}

void main()
{
  hello abc = new hello();
  print(abc.helloworld);
  abc.hellofunction();
}

// Output:
// This is Dart Programming
// Hello World


// 2. Constructors in Dart

class student
{
  student.constructor1(int a)
  {
    print('This is the parameterized constructor with only one parameter');
  }

  student.constructor2(int a, int b) {
    print('This is the parameterized constructor with two parameters');
    print('Value of a + b is ${a + b}');
  }
}

void main()
{
  student std1 = new student.constructor1(1);
  student std2 = new student.constructor2(2, 3);
}

// Practical No. 6

// Output:
// This is the parameterized constructor with only one parameter
// This is the parameterized constructor with two parameters
// Value of a + b is 5


// 3. Super Constructor in Dart

class SuperClass
{
  SuperClass(String class_name)
  {
    print("You are inside Parent constructor!!");
    print("Welcome to $class_name");
  }
}

class SubClass extends SuperClass
{
  SubClass() : super("SYCS")
  {
    print("You are inside Child constructor!!");
  }
}

void main()
{
  SubClass abc = new SubClass();
}

// Output:
// You are inside Parent constructor!!
// Welcome to SYCS
// You are inside Child constructor!!


// 4. Dart - this keyword

void main()
{
  mob m1 = new mob();
  m1.Car("M101");
}

class mob
{
  String mobile = 'abc';
  Car(String mobile)
  {
    this.mobile = mobile;
    print("The mobile is : ${mobile}");
  }
}

// Output:
// The mobile is : M101


// 5. Dart - Static Keyword

class Employee
{
  static var emp_dept;
  var emp_name;
  int emp_salary = 0;

  showDetails()
  {
    print("Name of the Employee is: ${emp_name}");
    print("Salary of the Employee is: ${emp_salary}");
    print("Dept. of the Employee is: ${emp_dept}");
  }
}

void main()
{
  Employee e1 = new Employee();
  Employee e2 = new Employee();
  Employee.emp_dept = "MIS";

  print("Dart static Keyword Example");
  e1.emp_name = 'Rahul';
  e1.emp_salary = 50000;
  e1.showDetails();

  e2.emp_name = 'Tina';
  e2.emp_salary = 55000;
  e2.showDetails();
}

// Output:
// Dart static Keyword Example
// Name of the Employee is: Rahul
// Salary of the Employee is: 50000
// Dept. of the Employee is: MIS
// Name of the Employee is: Tina
// Salary of the Employee is: 55000
// Dept. of the Employee is: MIS


// 6. Dart - Concept of Inheritance
// Dart program for Hierarchical inheritance

class ABC
{
  void output1()
  {
    print("Welcome to ABC!!");
  }
}

class ABCChild1 extends ABC
{
}

class ABCChild2 extends ABC
{
}

void main()
{
  var obj1 = new ABCChild1();
  obj1.output1();
  var obj2 = new ABCChild2();
  obj2.output1();
}

// Output:
// Welcome to ABC!!
// Welcome to ABC!!


// 7. Method Overriding in Dart

class SuperABC
{
  void show()
  {
    print("This is class SuperABC.");
  }
}

class SubABC extends SuperABC
{
  void show()
  {
    print("This is class SubABC child of SuperABC.");
  }
}

class SubABC2 extends SuperABC
{
  void show()
  {
    print("This is class SubABC2 child of SuperABC.");
  }
}

void main()
{
  SuperABC obj1 = new SuperABC();
  SubABC obj2 = new SubABC();
  SubABC2 obj3 = new SubABC2();

  obj1.show();
  obj2.show();
  obj3.show();
}

// Output:
// This is class SuperABC.
// This is class SubABC child of SuperABC.
// This is class SubABC2 child of SuperABC.


// 8. Getter and Setter Methods in Dart

class ABC
{
  String abcName='';
  String get getName
  {
    return abcName;
  }

  set setName(String name)
  {
    abcName = name;
  }
}

void main()
{
  ABC obj1 = ABC();
  obj1.setName = "Mobile App Technologies";
  print("Welcome to ${obj1.getName}");
}

// Output:
// Welcome to Mobile App Technologies


// 9. Abstract Classes in Dart

abstract class ABC
{
  void abc_info();
}

class PQR extends ABC
{
  @override
  void abc_info()
  {
    print("This is Class PQR.");
  }
}

class XYZ extends ABC
{
  @override
  void abc_info()
  {
    print("This is Class XYZ.");
  }
}

void main() {
  PQR obj1 = PQR();
  obj1.abc_info();
  XYZ obj2 = XYZ();
  obj2.abc_info();
}

// Output:
// This is Class PQR.
// This is Class XYZ.


// 10. Interface in Dart

void main()
{
  ABC abc1= new ABC();
  abc1.printdata1();
  abc1.printdata2();
  abc1.printdata3();
}

class Class1
{
  void printdata1()
  {
    print("Hello Class1 !!");
  }
}

class Class2
{
  void printdata2()
  {
    print("Hello Class2 !!");
  }
}

class Class3
{
  void printdata3()
  {
    print("Hello Class3 !!");
  }
}

class ABC implements Class1, Class2, Class3
{
  void printdata1()
  {
    print("Students Class1,\nWelcome to MAT Practical.");
  }

  void printdata2()
  {
    print("Students Class2,\nWelcome to MAT Practical.");
  }

  void printdata3()
  {
    print("Students Class3,\nWelcome to MAT Practical.");
  }
}

// Output:
// Students Class1,
// Welcome to MAT Practical.
// Students Class2,
// Welcome to MAT Practical.
// Students Class3,
// Welcome to MAT Practical.


// 11. Dart Programming - List

// Fixed Length List

void main()
{
  List? abc = List.filled(5, null, growable: false);
  abc[0] = 'item1';
  abc[1] = 'item2';
  abc[2] = 'item3';

  print(abc);
  print(abc[2]);
}

// Output:
// [item1, item2, item3, null, null]
// item3

// Growable List

void main()
{
  var abc = [ 'item1', 'item2' ];
  print(abc);
  abc.insert(2, 'item3');
  print(abc);
  abc.insertAll(3, [ 'item4', 'item5' ]);
  print(abc);
  print(abc[3]);
}

// Output:
// [item1, item2]
// [item1, item2, item3]
// [item1, item2, item3, item4, item5]
// item4


// 12. Dart - Sets

void main()
{
  var abc1 = <String>{"MAT Practical","Pracs1","Pracs2","Pracs3"};
  print("Values in set 1 are:");
  print(abc1);
  var abc2 = <String>{"Agile Practical","Pracs3","Pracs4","Pracs5"};
  print("Values in set 2 are:");
  print(abc2);
  print("Union of two sets is ${abc1.union(abc2)}");
  print("Intersection of two sets is ${abc1.intersection(abc2)}");
  print("Difference of two sets is ${abc1.difference(abc2)}");
  print("Difference of two sets is ${abc2.difference(abc1)}");
}

// Output:
// Values in set 1 are:
// {MAT Practical, Pracs1, Pracs2, Pracs3}
// Values in set 2 are:
// {Agile Practical, Pracs3, Pracs4, Pracs5}
// Union of two sets is {MAT Practical, Pracs1, Pracs2, Pracs3, Agile Practical, Pracs4,
// Pracs5}
// Intersection of two sets is {Pracs3}
// Difference of two sets is {MAT Practical, Pracs1, Pracs2}
// Difference of two sets is {Agile Practical, Pracs4, Pracs5}


// 13. Dart Programming - Map

void main()
{
  var abc = {'position0' : 'MAT'};
  print(abc);
  abc['position1'] = 'Practical';
  print(abc);
  print(abc['position0']! + abc['position1']!);
}

// Output:
// {position0: MAT}
// {position0: MAT, position1: Practical}
// MATPractical


// 14. Typedef in Dart

typedef MAT(int a, int b);

abc1(int a, int b)
{
  print("This is abc1");
  print("$a and $b are lucky numbers !!");
}

abc2(int a, int b)
{
  print("This is abc2");
  print("$a + $b is equal to ${a + b}.");
}

void main()
{
  MAT number = abc1;
  number(1, 2);
  number = abc2;
  number(3, 4);
}

// Output:
// This is abc1
// 1 and 2 are lucky numbers !!
// This is abc2
// 3 + 4 is equal to 7.


// 15. Mixins in Dart

mixin Jumping
{
  void jump()
  {
    print("Jumping!");
  }
}

class Animal {}

class Frog extends Animal with Jumping {}

void main()
{
  var frog = Frog();
  frog.jump();
}

// Output:
// Jumping!


// 16. Extensions in Dart

extension IntExtensions on int
{
  bool isEvenNumber()
  {
    return this % 2 == 0;
  }
}

void main()
{
  int number = 10;
  print(number.isEvenNumber());
}

// Output:
// true
