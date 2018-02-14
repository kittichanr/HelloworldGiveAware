```bash

```
<h1>HelloWorld by GiveAware</h1> 
 Software Process Management Project<br/>
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
set GiveAware=..(your root path project).. // เข้าไฟล์ catalina.bat จาก Text editor (run admin)
```   
![xx](https://user-images.githubusercontent.com/18551344/36192570-b6395094-1194-11e8-8759-9f8531812988.jpg)
**Step3**</br>
สร้างไฟล์ env โดยไปที่ Cmd เข้า root path project พิมพ์คำสั่ง
```bash
copy .env.example .env
```
เข้าไฟล์ .env แล้ว set path database
```bash
DB_HOST =        // ip address ของ database ที่จะเข้าไปเชื่อมต่อ
DB_PORT =        // port ของ database
DB_NAME =        // ชื่อของ database
DB_USERNAME =    // username ที่ใช้เข้าถึง database
DB_PASSWORD =    // password ที่ใช้เข้าถึง database
```
**Step4**</br>
deploy project
เข้า Cmd ไปยัง root path project แล้วใช้คำสั่ง
```bash
mvn tomcat:deploy
```

            
***

<h1>โครงสร้างฐานข้อมูลของโปรเจค</h1>

create table helloworld</br>
insert helloworld</br>
sql command ดูได้ที่ HelloWorld.sql



***





            
