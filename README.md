<h1>HelloWorld by GiveAware</h1>

 Software Process Management Subject<br/>
 วีดิโอทดสอบโปรเจค  https://youtu.be/X_OAM-YAF3A


<h1>สิ่งที่ต้องมีก่อนรันโปรเจค</h1>

```bash
1. Marven install
2. Tomcat install
```
<h1>ขั้นตอนการ Run Project</h1>

<br>**Step1**<br/>
Clone Project ลงเครื่อง<br/></br>
**Step2**<br/>
นำ Path root project ไปใส่ใน Catalina.bat ที่อยู่ใน Tomcat โดย set ดังนี้<br/>

```bash
set path_giveaware=..(your root path project).. // เข้าไฟล์ catalina.bat จาก Text editor (run admin)
```   
![xx](https://user-images.githubusercontent.com/18551344/36192570-b6395094-1194-11e8-8759-9f8531812988.jpg)
**Step3**</br>
เข้าไปที่ไฟล์ .env.example แล้ว set path database
```bash
DB_HOST =        // ip address หรือ localhost ของ database ที่จะเข้าไปเชื่อมต่อ
DB_PORT =        // port ของ database
DB_NAME =        // ชื่อของ database
DB_USERNAME =    // username ที่ใช้เข้าถึง database
DB_PASSWORD =    // password ที่ใช้เข้าถึง database
```
copy ไฟล์ .env.example แล้วแก้ชื่อเป็น .env ทำใน cmd เข้าไปที่ root path project แล้วพิมพ์คำสั่ง
```bash
copy .env.example .env
```
**Step4**</br>
deploy project
เข้า Cmd ไปยัง root path project แล้วใช้คำสั่ง
```bash
mvn tomcat:deploy
```
เมื่อต้องการอัพเดตโปรเจคให้ใช้คำสั่ง
```bash
mvn tomcat:redeploy
```
เมื่อต้องการยกเลิกการ deploy ให้ใช้คำสั่ง
```bash
mvn tomcat:undeploy
```          
หรือ deploy Project ที่ IDE editor

***

<h1>โครงสร้างฐานข้อมูลของโปรเจค</h1>

**Sql script**
```bash
CREATE TABLE HelloWorld (
            idName int,
            name varchar(255),
	           primary key (idName) 
            ); 
INSERT INTO HelloWorld(idName,name)
            VALUES (1,"HELLOWORLD");
```

หรือ เข้าไปดูได้ที่ **HelloWorld.sql** ที่แนบไว้ใน root path project







            
