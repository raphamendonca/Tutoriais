ano_informado = ARGV.first.to_i

idade = Time.now.year - ano_informado

puts "A idade é de #{idade} #{idade == 1 ? 'ano' : 'anos' } "
