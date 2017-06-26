limite = ARGV.first.to_i

(0..limite).each do |numero|
  puts numero if numero.odd?
end
