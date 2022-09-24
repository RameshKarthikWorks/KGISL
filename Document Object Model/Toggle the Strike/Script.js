
let checkBoxWithLabelContainerEl = document.getElementById("checkBoxWithLabelContainer");
let checkboxId = "checkbox";
let labelId = "checkboxLabel";

checkBoxWithLabelContainerEl.classList.add("bg-danger");

let checkboxInputEl = document.createElement("input");
checkboxInputEl.type = "checkbox"
checkboxInputEl.id = checkboxId;

function onCheckboxStatusChange() {
    checkboxLabelEl.classList.toggle("strike-through");
}

checkBoxWithLabelContainer.appendChild(checkboxInputEl);

let checkboxLabelEl = document.createElement("label");
checkboxLabelEl.classList.add("checkbox-label")
checkboxLabelEl.setAttribute("for", checkboxId)
checkboxLabelEl.id = labelId;
checkboxLabelEl.textContent = "i am Label";
checkboxLabelEl.style.color="white";
checkBoxWithLabelContainer.appendChild(checkboxLabelEl);


checkboxInputEl.onclick = function() {
    onCheckboxStatusChange();
};
