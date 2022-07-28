const { default: axios } = require('axios');
const { request } = require('express');

test ('Deve obter os produtos do banco de dados', async function() {
    const response = await axios(
        {
            url: 'http://localhost:3000/produtos',
            method: 'get'
        }
    );

    const resposta = response.data;
   expect(resposta).toHaveLength(1)
});

test.only ('Deve recuperar um registro no banco de dados a partir de um id', async function(){
    const response = await axios(
        {
            url: 'http://localhost:3000/produtos/9',
            method: 'get'
        }
    );
    const resposta = response.data;
    const id = resposta[0].id;
    const descricao = resposta[0].descricao;
    const preco = resposta[0].preco;
    const tipo_produto = resposta[0].tipo_produto;

    expect(id).toBe(9);
    expect(descricao).toBe('Descrição produto 005');
    expect(preco).toBe('R$ 5,99');
    expect(tipo_produto).toBe('Tipo de produto 004');
    
});

test ('Deve inserir um registro no banco de dados', async function(){});

test ('Deve alterar um registro no banco de dados a partir de um id', async function(){});

test ('Deve apagar um registro no banco de dados a partir de um id', async function(){});


