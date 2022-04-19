# **EVEN NUMBERS**

# Information

* **Program to find the average of numbers divisible by 3 and 4 entered from 0.**

# Technologies Used

* **JAVA**

# Contents

* Number, total, value variables are defined with int and average variable is defined with double.

* Scanner class is defined to enable the user to enter numbers.

* By using the for module, the range of 0 and the number entered by the user is defined.

* By using if in the for module, we have provided the rule for divisibility of numbers by 3 and 4.

<br />

# Codes

```Java

        import java.util.Scanner;

        public class evennumbers{

            public static void main(String[] args) {

                int number, total = 0, value = 0;

                double average;


```

```Java

                Scanner input = new Scanner(System.in);


                System.out.print("Enter The Number : ");

                number = input.nextInt();

```
```Java

                for(int i = 0; i <= number; i++){

                if((i % 3 == 0) && (i % 4 == 0)){

                    total += i;

                    value += 1;

                }

            } average = total / value;

            System.out.println("Average : " + average);
        }
    }

```

```bash

        Enter The Number : 25
        Average : 12.0

```

<br />

# LINK

* Click here https://github.com/Fogo9/EvenNumbers.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
