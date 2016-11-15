# wrapper

Rrecursive test.
   
========================

Requirements
------------
Install Java 8.65 version
http://www.oracle.com/ 

Install Apache Maven 
https://maven.apache.org

How to run a project?
--------------------------

```
mvn clean install exec:java -Dexec.mainClass="recursivetest.Test"
```
Example of execution:

00:54:07 [recursivetest.Test.main()] Test[INFO] - W(0,0) = 0.0
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(1,0) = 0.5
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(1,1) = 0.5
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(2,0) = 0.75
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(2,1) = 1.5
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(2,2) = 0.75
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(3,0) = 0.875
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(3,1) = 2.125
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(3,2) = 2.125
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(3,3) = 0.875
00:54:07 [recursivetest.Test.main()] Test[INFO] - W(322,156) = 306.48749781747574
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

author: Sergey Stotskiy

