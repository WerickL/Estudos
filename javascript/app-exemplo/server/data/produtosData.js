const database = require('../infra/conection');

exports.insert = function (produto) {
   
}

exports.getProdutos = function () {
    return database.query("SELECT * FROM produto");
}
exports.selectProdutoById = function (id) {
    return database.query("SELECT * FROM produto WHERE id = $1", [id]);
}

exports.update = function (id) {
   
}

