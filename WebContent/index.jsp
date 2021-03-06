9<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box}
body {font-family: "Lato", sans-serif;}

/* Style the tab */
.tab {
  float: left;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
  width: 30%;
  height: 300px;
}

/* Style the buttons inside the tab */
.tab button {
  display: block;
  background-color: inherit;
  color: black;
  padding: 22px 16px;
  width: 100%;
  border: none;
  outline: none;
  text-align: left;
  cursor: pointer;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current "tab button" class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  float: left;
  padding: 0px 12px;
  border: 1px solid #ccc;
  width: 70%;
  border-left: none;
  height: 300px;
}
</style>
</head>
<body>

<h2>Learners Academy School Report</h2>
<p>Click on the buttons inside the tabbed menu:</p>

<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'Student')" id="defaultOpen">Students</button>
  <button class="tablinks" onclick="openCity(event, 'Teacher')">Teachers</button>
  <button class="tablinks" onclick="openCity(event, 'Class')">Classes</button>
  <button class="tablinks" onclick="openCity(event, 'Subject')">Subjects</button>
  
</div>

<div id="Student" class="tabcontent">
<form action="StudentListpage" method="post">
  <label for="StudentId"><b>Student Id</b></label>
    <input type="text" placeholder="Enter Student Id" name="StudentId" id="sid" required>
    <label for="StudentName"><b>Student Name</b></label>
      <input type="text" placeholder="Enter Student Name"  name="StudentName" id="sname" required>
<br><br>
            <input type="submit" value="goto" name="btn" />              
      </form>
</div>

<div id="Teacher" class="tabcontent">
<form action="teacherlistpage" method="post">
  <label for="TeacherId"><b>Teacher Id</b></label>
    <input type="text" placeholder="Enter Teacher Id" name="TeacherId" id="tid" required>
    <label for="TeacherName"><b>Teacher Name</b></label>
      <input type="text" placeholder="Enter Teacher Name"  name="TeacherName" id="tname" required>
    <br><br>
            <input type="submit" value="goto" name="btn1" />              
      </form>
</div>

<div id="Class" class="tabcontent">
<form action="ClassListpage" method="post">
  <label for="ClassId"><b>Class Id</b></label>
    <input type="text" placeholder="Enter Class Id" name="ClassId" id="classid" required>
    <label for="ClassName"><b>Class Name</b></label>
      <input type="text" placeholder="Enter Class Name"  name="ClassName" id="classname" required>
    <br><br>
            <input type="submit" value="goto" name="btn2" />              
      </form>
</div>



<div id="Subject" class="tabcontent">
<form action="SubjectListPage" method="post">
  <label for="SubjectId"><b>Subject Id</b></label>
    <input type="text" placeholder="Enter Subject Id" name="SubjectId" id="subid" required>
    <label for="SubjectName"><b>Subject Name</b></label>
      <input type="text" placeholder="Enter Subject Name"  name="SubjectName" id="subname" required>
    <br><br>
            <input type="submit" value="goto" name="btn3" />              
      </form>
</div>

<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();
</script>
   
</body>
</html> 
