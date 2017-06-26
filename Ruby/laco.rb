array = [1,2,3,4]

array.each { |elemento| puts "=> #{elemento} <="}

array.each do |elemento|
  puts elemento - 1
end
