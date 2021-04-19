<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
          name="viewport">
    <meta content="ie=edge" http-equiv="X-UA-Compatible">
    <title>Task</title>
    <link href="css/freemarker.css" rel="stylesheet">
</head>
<body>
<h1 class = "title">${date}</h1>
<div class="container">

    <#list tasks as task>
    <div class="row ${task?item_parity} flex">
        <div class="column1">
            ${task?counter}
        </div>
        <div class="column2">
            <div style="width:10px; height:10px; background-color:${task.category}"> </div>
        </div>
        <div class="column3">
            ${task.name}
        </div>
        <div class="column4">
            ${task.description}
        </div>
        <div class="column5">
            <a href="/tasks?date=${date}&task=${task.name}"> Remove Task </a>
        </div>
    </div>
</#list>
</div>
<a class="list_button" href="/task/add?date=${date}">Add Task</a>
</div>
</div>
<a class="list_button" href="/calendar">Calendar</a>
</div>
</body>
</html>