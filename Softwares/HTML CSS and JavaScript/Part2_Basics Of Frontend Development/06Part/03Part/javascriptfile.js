document.querySelector("form").addEventListener("submit", myTodo);
function myTodo(){
    event.preventDefault();
    var task = document.getElementById("task").value;
    var priority = document.getElementById("priority").value;
    console.log(task, priority);

    var tr = document.createElement('tr');
    var td1 = document.createElement('td');

    td1.innerText = task;
    var td2 = document.createElement('td');
    td2.innerText = priority;

    if(priority == "high"){
        //setting up the attribute to make id as high
        td2.setAttribute("id", "high");
    }else{
        //setting up the attribute to make class as low
        td2.setAttribute("class", "low");
    }

    var td3 = document.createElement('td');
    td3.innerText = "Delete";
    td3.addEventListener('click', deleteToDo);

    tr.append(td1, td2, td3);

    document.querySelector("tbody").append(tr);
}
function deleteToDo(){
    console.log(event.target.parentNode);
    event.target.parentNode.remove();
}

/*
syntax for the set attribute:
element.setAttribute(attributeName, attributeValue);
*/