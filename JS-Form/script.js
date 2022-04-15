function send() {
  var fname = document.getElementById("fname").value;
  var lname = document.getElementById("lname").value;
  var phno = document.getElementById("phno").value;
  var email = document.getElementById("email").value;
  var data = fname+" "+lname+"\n"+email+"\n"+phno;
  window.alert(data);
}