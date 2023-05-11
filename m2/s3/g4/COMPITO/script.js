let apiKey = "p3fpGqWkuduCD6UXQ7E9v8NC1kbEBHRgKcZ784HmnwNGKz2KEhl6S7tN";

fetch("https://api.pexels.com/v1/search?query=cities", {
    headers: { 
        Authorization: [apiKey],
    },
})
.then((res) => {
    console.log(res);
    if (res.ok) {
      return res.json();
    } else {
      throw new Error("Errore")
    }
})
.then((data) => {
    console.log(data)
})
.catch((error) => {
    console.log(error)
})