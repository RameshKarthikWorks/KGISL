
let skillList = [{
    skillName: "HTML",
    uniqueNo: 1,
},
{
    skillName: "CSS",
    uniqueNo: 2,
},
{
    skillName: "JavaScript",
    uniqueNo: 3,
}
];



let ulist =document.getElementById("ulid");
let label =document.getElementById("labelid")

function labelselection(label)
{

    let l=document.getElementById(label);
    l.classList.toggle="Selected";
}

function check(skill)
{
    let ch="checkbox"+skill.uniqueNo;
    let l1="label"+skill.uniqueNo;
    let list = document.createElement("li");
    ulist.appendChild(list);
}

let input =document.createElement("input");
input.type="checkbox";
input.id="inpid";






for(let i in skillList)
{
    document.write('<input type="checkbox" id="'+skillList[i]+uniqueNo+'">'+skillList[i].skillName+'<br>"
}