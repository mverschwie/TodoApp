const lijst = document.getElementById("todo-list")
const url = "http://127.0.0.1:2001"
const data = { omschrijving: document.getElementById('omschrijving').value };


async function postData() {
  const postTodo = await fetch(url + "/todo/nieuwe-todo", {
  method: 'POST', // or 'PUT'
  headers: {
    'Content-Type': 'application/json',
  },
  body: JSON.stringify(data),
});

const postData = await postTodo.json()

console.log(postData)

}

async function loadData() {
    const response = await fetch(url + "/todo/all")
    const data = await response.json()

    return data
}

async function getTodoList() {
    const data = await loadData() 
    for(let i = 0; i < data.length; i++) {
        let a = document.createElement("li")
        let b = document.createElement("li")
        let c = document.createElement("li")
        a.innerText = data[i].omschrijving
        b.innerText = data[i].datumToegevoegd
        lijst.appendChild(a);
        lijst.appendChild(b);
    }
}

// document.addEventListener('DOMContentLoaded',()=> {
//     document.getElementById('button').addEventListener('click', postData)
//     loadData
//     getTodoList
// });

postData()
loadData()
getTodoList()