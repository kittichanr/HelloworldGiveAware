 ```bash

```
<h1>HelloWorld by GiveAware</h1> 
 Software Process Management Project<br/>
 วีดิโอทดสอบโปรเจค  https://youtu.be/X_OAM-YAF3A


<h1>สิ่งที่ต้องมีก่อนรันโปรเจค</h1>

```bash
1. Marven
2. Tomcat
```
<h1>ขั้นตอนการ Run Project</h1>
 **Step1**<br/>
Clone Project ลงเครื่อง<br/>
 **Step2**<br/>
นำ Path root project ไปใส่ใน Catalina.bat ที่อยู่ใน Tomcat โดย set ดังนี้<br/>
 ```bash
 set 
 ```  
  
***

**Database** <br/>
ขั้นตอนการสร้างตาราง HelloWorld <br/>
1. เข้าไปที่ database Server <br/>
2. สร้าง Schema ชื่อ ...
3. สร้างตาราง HelloWorld
```bash
  Syntax -> CREATE TABLE HelloWorld (
            idName int,
            name varchar(255) 
            ); 
 ```
       
4. เพิ่มค่า Helloworld ลง Table

 ```bash
  Syntax -> INSERT INTO HelloWorld(idName,name)
            VALUES (1,"HELLOWORLD");
 ```
5. ดึงค่าเพื่อมาแสดง
 ```bash
  Syntax -> SELECT * FROM HelloWorld ;
 ```



***

**Marven install**<br/>


<img width="712" alt="searchcatalina" src="https://user-images.githubusercontent.com/18551344/36144557-0281a7b2-10e1-11e8-8ac7-b5cd6dafce14.png">

<img width="721" alt="setpath" src="https://user-images.githubusercontent.com/18551344/36144559-02ba78da-10e1-11e8-8352-7a9afbcc0877.png">
            
