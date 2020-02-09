An array is 4 bytes, (that is 8 bits form a byte, 4 bytes form one bit array a.k.a bit vector)
- 1 bits
- 1 byte = 8 bits
- 1 kB = 1024bytes...
- Nibble = 4 bits (1/2 byte)
- 1 word = 2 bytes = 16bits
- 1 long word = 4 bytes = 32 bits

- Cada entero cuantos bits tiene(variable)?
    - how many bits have each integer? 16, 32bits

a bit array initialize all memory locations to 0

if we write bitvector[position] = 1, which means bitvector will convert the position to corresponding memory location and set the bit value 1 from 0, if the bit is 1 already dont do it anything

para saber la posición del array suponiendo q cada variable es de 32bits,
  - number_Position/number_bits = this tell us which array A[array] (bit position)
  - number_Position % number_bits = this tell us the position inside array A[position] (array element with index)


- Operaciones de bits
  - xor = solo 1 x 0 o viceversa da 1, lo demas es 0

### Operadores de desplazamiento de Bits
permiten mover los bits dentro de una cadena
## operador de desplazamiento a izquierda
(valor_binario1) << (valor_binario2)
desplaza el valor_binario1 a izquierdas tantas veces como indique el valor_binario2. Los bits se mueven a la izquierda y se añaden tantos ceros como indique el valor_binario 2.
(0011) << (0011) = 11000

## operador de desplazamiento a derecha
Si tiene que meter un 1 o tiene que meter un 0 dependerá del valor del bit del signo. Si el valor del bit de signo es positivo (0), lo que hace es insertar 0. Si el valor del bit de signo es negativo (1), lo que hace es insertar 1.

(1000) >> (0011) = 0001
### Como funciona en maquina
- num % 32 => num & 0x1F
- num / 32 => num >> 5  
