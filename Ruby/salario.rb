
salario = ARGV.first.to_i
mesesTrabalhados = ARGV[1].to_i


icms = 0.02

salario1 = salario * (1 - icms)

inss = 0.03

salario2 = salario1 * (1 - inss)

salario13 = salario / 12 * mesesTrabalhados

puts "Salario liquido é #{salario2}"
if mesesTrabalhados != 0
 puts "Seu 13º salario é #{salario13}"
end

