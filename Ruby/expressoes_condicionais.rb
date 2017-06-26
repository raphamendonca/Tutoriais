nome = ARGV.first
senha = ARGV[1]

puts "nome => #{nome}"
puts "senha => #{senha}"

autorizado = nome == 'raphael' && senha == 'secreta'

if autorizado
  puts "Autorizado"
else
  puts "Não Autorizado"
end
