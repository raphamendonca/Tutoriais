id_do_cliente = ARGV.first.to_i

puts "Buscando informações do cliente ##{id_do_cliente}..."

clientes = {
  1 => {nome: 'Lucas', data_de_cadastro: '25/11/2014', cidade:'Roseira-SP'},
  2 => {nome: 'Pedro', data_de_cadastro: '15/11/2014', cidade:'Sâo Paulo-SP'},
  3 => {nome: 'Raphael', data_de_cadastro: '18/11/2014', cidade:'Florianopolis-SC'}}

cliente = clientes[id_do_cliente]

puts "Nome: #{cliente[:nome]}"
puts "Data de cadastro: #{cliente[:data_de_cadastro]}"
puts "Cidade: #{cliente[:cidade]}"
