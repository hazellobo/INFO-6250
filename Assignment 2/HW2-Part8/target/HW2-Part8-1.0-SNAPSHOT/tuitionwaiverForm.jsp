<%-- 
    Document   : newjsp
    Created on : Oct 7, 2022, 9:30:29 PM
    Author     : hazel
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Tuition Waiver Form</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="header">
		<div>
                    <img src="logo.png" width="100" height="100" alt="Northeastern"/>
                    Northeastern University <br/> <b> Human Resources</b>
		</div>
		<div>
			<h1>Tuition Waiver Form</h1>
		</div>
	</div>
	
	<br>
	<div id="boxed_section"><B>This form is used by part-time faculty, part-time staff, retirees, their spouses or domestic partners and their dependents.
	All full-time faculty and staff should use the online Tuition Waiver Form found on myNEU. Before completing this form,
	please refer to the Tuition Waiver Program Guidelines. Be sure to include a Dependent Certification Form along with
	the submission of this form for any dependent children.</B></div>

<form method="POST" action="viewSubmittedData.htm">
	<div class="section_1">
		<h2>Section 1</h2>
		<label for="academicTerm">Academic Term:</label>
                <input type="text" name="academicTerm" id="academicTerm" required>

		<label for="academicYear">Academic Year:</label>
		<input type="text" name="academicYear" id="academicYear" pattern="\d{4}" maxlength="4" required>

		<label for="employeeStatus">Employee Status:</label>
		<input type="checkbox"  name="employeeStatus"  value="ptstatff">
                <label for="ptstaff">P/T Staff</label>
		
                <input type="checkbox"  name="employeeStatus" value="ptfaculty">
                <label for="ptfaculty">P/T Faculty</label>
		
		<input type="checkbox"  name="employeeStatus" value="retiree">
                <label for="retiree">Retiree</label>
		
		<input type="checkbox"  name="employeeStatus" value="other">
                <label for="employeeStatusOther">Other</label>                
		<input type="text" name="employeeStatusOther">
		<br/>
                
		<p>(Fall, Winter, Spring, or Summer)*</p>


		<p>*Terms with multiple sessions are considered one academic term for tuition waiver purposes e.g., summer sessions I and
		II are considered one academic term.</p>
	</div>
	
	<div class="section_2">
		<h2>Section 2</h2>
		<label for="studentName">Student's Name</label>
		<input type="text" name="studentName" required>

		<label for="relationshipToEmployee">Relationship to Employee</label>
		<input type="text" name="relationshipToEmployee" required>

		<label for="studentNuid">Student's NUID:</label>
		<input type="text"  name="studentNuid" required>
		
		<br/><br/>
		
                <label for="employeeName">Employee’s Name (if different from Student’s)</label>
		<input type="text"  name="employeeName">
		
		<label for="employeeNuid">Employees's NUID</label>
		<input type="text"  name="employeeNuid">
		</br></br>
		
		<label for="department">Department</label>
		<input type="text"  name="department" required>
		
		
		<label for="campus">Campus Location</label>
		<input type="text"  name="campus" required>
		
		<label for="phone">Phone Number</label>
		<input type="text"  name="phone" required>
		
		<label for="supervisorName">Supervisor's Name</label>
		<input type="text"  name="supervisorName" required>
	</div>	
		
	<div class="section_3">
		
		<h2>Section 3</h2>
                <h4><I>Indicate the applicable school or program:</I></h4>

		<input type="text"  name="ungergradProgram">
		<label for="ungergradProgram">Undergraduate Program</label>
		
		<input type="text"  name="lawSchool">
		<label for="lawSchool">Law School (excludes employees)</label>
		
		<input type="text"  name="doctoralCandidate">
		<label for="doctoralCandidate">Doctoral Candidate</label>
		</br></br>
		
		<input type="text"  name="cpsUndergrad">
		<label for="cpsUndergrad">College of Professional Studies (CPS) Undergraduate</label>
		
		<input type="text"  name="gradSchool">
		<label for="gradSchool">Graduate School</label>
		
		<input type="text"  name="cpsgrad">
		<label for="cpsgrad">College of Professional Studies (CPS) Graduate</label>
		
		<div id="boxed_section" class="colored_div">
			<b>One course per academic term may be taken one-half hour before the end of your workday.
			If this applies to you, this form must be signed by your supervisor below and approved by Human Resources Management.</b>
		</div>
		<div id="boxed_section" class="colored_div">
			<b>Complete the following course information. If you are an employee taking a job related course, please attach the Job
			Related Designation Form to this waiver.</b>
		</div>
		
		<div class="section_3_table">
		<table style="width:100%">
		  <tr>
			<th>Course No.</th>
			<th>Course Name</th>
			<th>Supervisor</th>
			<th>Signature</th>
			<th>Credit Hrs.</th>
			<th>Day(s)</th>
			<th>Time</th>
		  </tr>
		  <tr>
			<td><input type="text" name="courseNo1"></td>
			<td><input type="text" name="couseName1"></td>
			<td><input type="text" name="supervisor1"></td>
			<td><input type="text" name="sign1"></td>
			<td><input type="text" name="creditHours1"></td>
			<td><input type="text" name="days1"></td>			
			<td><input type="text" name="time1">a.m./p.m.</td>
		  </tr>
		  <tr>
			<td><input type="text" name="courseNo2"></td>
			<td><input type="text" name="couseName2"></td>
			<td><input type="text" name="supervisor2"></td>
			<td><input type="text" name="sign2"></td>
			<td><input type="text" name="creditHours2"></td>
			<td><input type="text" name="days2"></td>			
			<td><input type="text" name="time2">a.m./p.m.</td>
		  </tr>
		  <tr>
			<td><input type="text" name="courseNo3"></td>
			<td><input type="text" name="couseName3"></td>
			<td><input type="text" name="supervisor3"></td>
			<td><input type="text" name="sign3"></td>
			<td><input type="text" name="creditHours3"></td>
			<td><input type="text" name="days3"></td>			
			<td><input type="text" name="time3">a.m./p.m.</td>
		  </tr>
		</table>
		</div>
	</div>

	<div class="section_4">
		<h2>Section 4</h2>
			<p><b>In accordance with Northeastern University's Tuition Waiver Program Guidelines, my signature attests that I am
			currently enrolled in the above courses, or that the student listed above is my spouse, domestic partner or
			unmarried dependent child or the dependent child of my domestic partner as defined under current IRS tax
			regulations. I also certify that I have read the Tuition Waiver Program Guidelines.</b> </p>
			
		<label for="employeeSign">Employee's Signature</label>
			<input type="text"  name="employeeSign" required>
			
			<label for="employeeSigndate">Date</label>
			<input type="text"  name="employeeSigndate" required>
	</div>

	<div class="section_5">
			<h2>Section 5</h2>
			<label for="hrmApproval">HRM Approval</label>
			<input type="text"  name="hrmApproval" required>
			
			<label for="hrmApprovaldate">Date</label>
			<input type="text"  name="hrmApprovaldate" required>
	</div>
	<br/><br/>
	<input type="submit" value="Submit">
</form>	
<div id="boxed_section" class="colored_div">
	Forms will be reviewed for completeness and eligibility. You will be notified if any additional information is needed. Mail completed form to
	<b>Human Resources, 250 Columbus Place or fax to (617) 373-7610</b>.
	 All waivers must be received by HRM within 30 days of the course start date.
</div>


 
</body>
</html>

