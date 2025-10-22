document.querySelector("form").addEventListener("submit", myTodo);
function myTodo(){
    //useful for visible in the console of inspect
    event.preventDefault();
    var task = document.getElementById("task").value;
    var priority = document.getElementById("priority").value;
    //to print in the console
    console.log(task, priority);

    var tr = document.createElement('tr');
    var td1 = document.createElement('td');

    td1.innerText = task;
    var td2 = document.createElement('td');
    td2.innerText = priority;

    if(priority == "high"){
        td2.style.backgroundColor = "black";
        //color is not given in css
        td2.style.color = "red";
    }else{
        //by default makes the background give by css
        td2.style.backgroundColor = "";
        td2.style.color = "blue";
    }

    var td3 = document.createElement('td');
    td3.innerText = "Delete";
    //calls the function deleteToDo
    td3.addEventListener('click', deleteToDo);

    tr.append(td1, td2, td3);

    document.querySelector("tbody").append(tr);
}
function deleteToDo(){
    /*
    //in the inspect console we should not just delete the delete
    console.log(event.target);*/
    /*
    //which gives entire tr tag which has td, td, and td tags in the 
    //inspect console
    console.log(event.target.parentNode);*/

    console.log(event.target.parentNode);
    //this code removes
    event.target.parentNode.remove();
}