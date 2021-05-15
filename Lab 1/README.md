# LAB 01

## Deliverables
- https://github.com/Big-Habibs/seg3103_playground

### Java
I am running the latest version of java:

![java version lab1](https://user-images.githubusercontent.com/72233859/118376815-4d366900-b598-11eb-9449-fa247f3575b1.png)

After compiling newmath_java, here is the result I obtained:
![JUnit running lab1](https://user-images.githubusercontent.com/72233859/118376880-a3a3a780-b598-11eb-8f99-d34a6a12de74.png)

### JUnit
I am running JUnit 5.
I compiled the file using this command:

'javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java'

Then I ran the test with this command:

'java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path'

Which gave me this result:

![JUnit running lab1](https://user-images.githubusercontent.com/72233859/118376973-1f055900-b599-11eb-9929-da72890de804.png)

### Elixir
This is my elixir version:

![elixir version](https://user-images.githubusercontent.com/72233859/118377008-5ecc4080-b599-11eb-9e11-3c757392f20e.png)

I compile it using:

'mix compile'

And then I run it using:

'iex -S mix'

Which gives me a result of:

![running elixir code](https://user-images.githubusercontent.com/72233859/118377031-773c5b00-b599-11eb-8867-5bceee54a5d0.png)
