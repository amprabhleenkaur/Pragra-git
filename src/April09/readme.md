1. new ClassName() is a constructor call not constructor creation.
2. When a class is created, default constructor is automatically created if there is no 
parameterized constructor given.
3. Even if we change the return type of the method, it won't be method overloading.
4. JVM itself is machine dependent but the bytecode it generates is machine independent.
5. We can do main() overloading, but it is not the same main() that JVM looks for.
   Ex. public static void main(String[] args){}
       public static void main(int[] arr){}
6. ClassName obj = new ClassName(); here, memory allocation for the new object shall be 
provided/stored in heap while reference (address) for the same (obj) shall be stored in 
Stack. 
7. Static variable could refer to common property of all the objects. That means, it's
shared by all the class members. It is useful in memory management as memory is allocated
only once, unlike instance variables where memory is allocated everytime they are called.
8. Static methods cannot use non-static data members. this and super keyword cannot be
used in static context.
9. main() is static because there is no object created at the time and compiler can access
it. Also, it's void because we are not returning anything at the time it is called.
10. Static block is initialized only once and is run before the main().
Ex. static{ databaseConnection, etc. }
11. Instance block is called once the object is created.
Ex. {}
12. We can have multiple instance and static blocks in our class.