curl -d "logradouroEndereco":"Ipitanga", "cepEndereco": 4000000, "numeroEndereco": 615, "cidadeEndereco": "Salvador", "enderecoFavorito":true, "pessoa":{ "idPessoa": 1 } -H "Content-Type: application/json" -X POST http://localhost:8080/tecnicoEndereco/endereco

curl -d "logradouroEndereco":"Itapuã", "cepEndereco": 412345, "numeroEndereco": 003, "cidadeEndereco": "Salvador", "enderecoFavorito":false, "pessoa":{ "idPessoa": 2 } -H "Content-Type: application/json" -X POST http://localhost:8080/tecnicoEndereco/endereco

curl -d "logradouroEndereco":"Liberdade", "cepEndereco": 412789, "numeroEndereco": 253, "cidadeEndereco": "São Paulo", "enderecoFavorito":true, "pessoa":{ "idPessoa": 2 } -H "Content-Type: application/json" -X POST http://localhost:8080/tecnicoEndereco/endereco