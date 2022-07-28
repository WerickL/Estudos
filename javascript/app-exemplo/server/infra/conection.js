const pgp = require('pg-promise')();
const bancoDeDados = pgp(
    {
        user : 'postgres',
        password: '123456',
        host: 'localhost',
        port: '5432',
        database: 'bd_lojinha'
    }
);

module.exports = bancoDeDados;