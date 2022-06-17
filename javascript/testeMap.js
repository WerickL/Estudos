let palavras = new Map();
palavras.set("word", 1)
palavras.set("word2", 1)
palavras.set("word3", 1)
if (palavras.has("word3")) {
  let value = palavras.get("word3")
palavras.set("word3", ++value)
}
console.log(palavras.get("word"));
