#definindo classes
class Usuario
  attr_reader :ano_de_nascimento
  attr_writer :nome

  attr_accessor :teste

  def initialize(nome, ano_de_nascimento) # metodo construtor
    @nome = nome #atribuindo o valor inicial para a variavel de instancia
    @ano_de_nascimento = ano_de_nascimento
  end

  def nome #getter
    @nome
  end

  def nome=(param) #setter
    @nome = param
  end

  def idade
    ano_atual - @ano_de_nascimento
  end

  private # desse ponto em diante todos os metoos sao privados
  def ano_atual
    Time.now.year
  end

end


# instancia objetos
usuario = Usuario.new('Lucas', 1987)
puts usuario.nome
puts usuario.idade
puts usuario.ano_de_nascimento

puts '----------'

usuario2 = Usuario.new('Pedro', 2001)
puts usuario2.nome
puts usuario2.idade
usuario2.nome = "Jose"
puts usuario2.nome
