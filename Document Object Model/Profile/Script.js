let profileDetails = {

    imgSrc: "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/user-profile-img.png",

    name: "Ravi",

    age: Age=25

};



let div = document.getElementById("divid");

let img =document.getElementById("imgid");

img.src=profileDetails.imgSrc;
div.style.backgroundColor="purple";
div.style.width="400px";
div.style.margin="auto";
div.style.height="450px";
div.style.margintop="100px";
div.classList.add("text-center");
div.appendChild(img);

let p=document.createElement("h3");
p.textContent=profileDetails.name;
p.style.color="white";
p.style.padding="10px";
div.appendChild(p);

let age = document.createElement("h3");
age.textContent="Age : "+profileDetails.age;
age.style.color="white";
div.appendChild(age);







