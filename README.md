# Projeto de Engenharia de Software

## 1. Descrição do Projeto

O projeto consiste no desenvolvimento de um jogo de adivinhação de notas de filmes, no qual os participantes devem tentar estimar a avaliação de diferentes filmes em uma escala de 0 a 10.

Antes do início da partida, os jogadores informam seus nomes e configuram a quantidade de rodadas e participantes. Durante o jogo, o sistema apresenta filmes selecionados aleatoriamente, sem repetições na mesma partida. Cada jogador envia seu palpite e recebe uma pontuação de acordo com a proximidade entre sua estimativa e a nota correta do filme.

Ao final da partida, o sistema apresenta a pontuação dos participantes e gera um pódio com a classificação final dos jogadores. Os resultados são armazenados temporariamente durante a execução da partida e descartados após seu encerramento, sem manter um histórico permanente.
## 2. Requisitos Funcionais (RF)

Os requisitos funcionais descrevem as funcionalidades que o sistema deve oferecer.

- **RF01 – Identificação do jogador:** O sistema deve permitir que os participantes informem seus nomes antes do início da partida.
- **RF02 – Configuração da partida:** O sistema deve permitir configurar a quantidade de rodadas e o número de participantes.
- **RF03 – Seleção de filmes:** O sistema deve selecionar filmes aleatoriamente, sem repetir títulos durante a mesma partida.
- **RF04 – Envio de palpites:** O sistema deve permitir que os jogadores informem palpites entre 0 e 10 para cada filme apresentado.
- **RF05 – Validação de palpites:** O sistema deve validar os valores informados, impedindo palpites fora do intervalo permitido.
- **RF06 – Cálculo de pontuação:** O sistema deve calcular a pontuação de cada jogador considerando a diferença entre o palpite e a nota correta do filme.
- **RF07 – Acumulação de pontos:** O sistema deve acumular automaticamente a pontuação dos jogadores ao longo das rodadas.
- **RF08 – Resultado e classificação da partida:** O sistema deve apresentar a pontuação final dos participantes e gerar um pódio com a classificação dos jogadores ao término da partida.
## 3. Requisitos Não Funcionais (RNF)

Os requisitos não funcionais descrevem características de qualidade e restrições que o sistema deve atender.

- **RNF01 – Usabilidade:** O sistema deve apresentar uma interface simples e intuitiva, facilitando a utilização pelos jogadores.
- **RNF02 – Desempenho:** O sistema deve realizar os cálculos de pontuação e atualizar os resultados sem atrasos perceptíveis.
- **RNF03 – Confiabilidade:** O sistema deve garantir que os palpites e as pontuações sejam processados corretamente.
- **RNF04 – Integridade dos dados:** O sistema deve garantir que os palpites e as pontuações dos participantes sejam armazenados e processados corretamente durante a execução da partida.
- **RNF05 – Compatibilidade:** O sistema deve funcionar adequadamente no ambiente e nas plataformas definidos para sua implementação.
- **RNF06 – Manutenibilidade:** O código deve ser organizado e estruturado de forma a facilitar futuras correções e melhorias.

## Planejamento e Gerenciamento — Scrum (Jira)

O planejamento e o acompanhamento das atividades do projeto Movie Guesser são realizados utilizando a metodologia ágil Scrum, no Jira.

### US-02 — Configurar partida

**Responsável:** Mayara

**Título:** Configurar partida.

**História de usuário:**

Como jogador, quero configurar uma partida escolhendo a quantidade de rodadas e o número de participantes, para personalizar o jogo de acordo com minhas preferências.

**Descrição da funcionalidade:**

Permitir que o jogador configure os parâmetros da partida antes de seu início, definindo a quantidade de rodadas e o número de participantes. O sistema deverá validar as opções selecionadas e garantir que a partida seja iniciada de acordo com as configurações estabelecidas.

**Critérios de aceite:**

1. Permitir que o jogador escolha a quantidade de rodadas da partida.
2. Permitir que o jogador defina o número de participantes.
3. Validar se as quantidades informadas estão dentro dos limites permitidos pelo sistema.
4. Impedir o início da partida caso a configuração seja inválida.
5. Garantir que a partida respeite a quantidade de rodadas e participantes selecionada.

### US-06 — Gerenciar resultados e gerar pódio da partida

**Responsável:** Ana

**Título:** Gerenciar resultados e gerar pódio da partida.

**História de usuário:**
Como jogador, quero que as pontuações de todos os participantes sejam acumuladas durante a partida e que, ao final, seja apresentado um pódio com a classificação dos jogadores, para comparar seus desempenhos.

**Descrição da funcionalidade:**
Gerenciamento temporário dos resultados dos participantes durante uma partida, permitindo acumular as pontuações individuais e apresentar a classificação final após a conclusão de todas as rodadas.
Os resultados serão mantidos apenas durante a execução da partida, sem armazenamento permanente ou utilização de banco de dados.

**Critérios de aceite:**

1. Armazenar temporariamente os palpites e as pontuações de cada participante durante a partida.
2. Acumular individualmente os pontos obtidos em cada rodada.
3. Calcular a pontuação total de todos os participantes ao final da partida.
4. Ordenar os participantes conforme suas pontuações, da maior para a menor.
5. Apresentar o pódio final com a classificação dos jogadores.
6. Descartar os dados temporários após o encerramento da partida, sem manter histórico permanente.

