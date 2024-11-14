<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<form>
       <label>Id:</label>
       <input type="text" name="id" /><br/>
      <label>Name :</label>
      <input type="text" name="name" /><br/>
      <label>SName :</label>
      <input type="text" name="name" /><br/>
     
     <label>Address :</label>
      <input type="text" name="Address" /><br>
      <label>Age :</label>
      <input type="text" name="Age" /><br>
     
      <label>pincode :</label>
      <input type="text" name="name" /><br/>
     
      <label for="city">Choose a city:</label>

   <select name="city">
   <option value="select">select</option>
   <option value="pune">pune</option>
  <option value="pune">pune</option>
  <option value="Manchar">Manchar</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Nashik">Nashik</option>
</select>

<label for="state">choose a state</label>
<select name="state">
<option value="select">select</option>
  <option value="Maharashtra">Maharashtra</option>
  <option value="MADHYA PRADESH">MADHYA PRADESH</option>
  <option value="GUJARAT">GUJARAT</option>
  <option value="Goa">Goa</option>
</select><br>

      <label for="Education">choose a Education</label>
      
<select name="Education">
<option value="select">select</option>
  <option value="BSC Com.science">BSC Com.science</option>
  <option value="Master com.science">Master com.science</option>
  <option value="Enginerring">Enginerring</option>
  <option value="Diploma">Diploma</option>
</select><br>

 <label for="Passing year">choose a Passing year</label>
<select name="Passing year">
<option value="select">select</option>
  <option value="2020">2020</option>
  <option value="2021">2021</option>
  <option value="2022">2022</option>
  <option value="2023">2023</option>
</select><br>
 <label for="phone">Enter your phone number:</label>
 <input type="tel" id="phone" name="phone" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}"><br>

     
       <lable>Choose your gender:</lable>
        <label for="male">Male</label>
        
        <input type="radio" name="gender" id="male" value="male" checked>
        <label for="female">Female</label>
        
        <input type="radio" name="gender" id="female" value="female"><br>
     
      <label>Email Id :</label>
       <input type="text"  name="email"/><br>
       <label>Password :</label>
      <input type="Password" name="Pass" /><br>
      
      
      <input type="submit" />
      
     </form>

</body>
</html>