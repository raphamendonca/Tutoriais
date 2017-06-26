
mega = []
while mega.size < 6
  number = rand(60)
  if !mega.include? number
    mega << number
  end
end

puts mega.sort
