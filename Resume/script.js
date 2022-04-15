let a = true;


function newpage(){
  window.open('https://media-exp1.licdn.com/dms/image/C4E03AQHohrBuoqvZUw/profile-displayphoto-shrink_200_200/0/1618897687014?e=1653523200&v=beta&t=xKkJLHyiHMs5okr4_R50fWyklZJkbN71Bu5qFOEbf6Q'); 

}

function showSkills() {
  if(a == true) {
    document.getElementById('skills').innerHTML='<table class="table center" cellpadding="1%" cellspacing="10"><tr><th>Domain</th><th>Proficiency</th></tr><tr><td>C++</td><td>⭐⭐⭐⭐</td></tr><tr><td>Java</td><td>⭐⭐⭐⭐⭐</td></tr><tr><td>MySQL</td><td>⭐⭐⭐</td></tr><tr><td>DSA</td><td>⭐⭐⭐⭐</td></tr></table>'
  a = false;
  }
  else {
    a = true;
    document.getElementById('skills').innerHTML="";
  }
  
}
