# FoxramAlpha-Backend
> Computer algebra system

## What was used in the project?
0. [Kotlin](https://kotlinlang.org/)
1. [Spark](http://sparkjava.com/)
2. [Dagger2](https://github.com/google/dagger)
3. [Gson](https://github.com/google/gson)
4. [JUnit](https://junit.org/junit5/)

## What is FoxramAlpha?
FoxramAlpha is a computer algebra system that allows calculations with large numbers. A complete list of service features can be found at the [link](https://docs.google.com/document/d/1Dv_6AIhxg_3ezu6VMcEnMpyfRzgym9l8PmE4ULGfjgM/edit). A distinctive feature of FoxramAlpha is the work with polynomials and work with them in algorithms of discrete mathematics.

## API
### Get form
> Returns form to fill in 
* URL
<br/>`.../api/form`
* Method
<br/>`POST`
* Example request
```
{
  "type": "P-8"
}
```
* Example success response
```
{
  "form": {
    "type": "P-8",
    "number1": true,
    "number2": true,
    "number3": false,
    "digit": false,
    "title": "Умножение многочленов",
    "description": "Примеры ввода многочленов: [x^2 + x - 1]"
  },
  "status": "ok"
}
```
* Example wrong response
```
{
  "status": "error",
  "error": "Bad Request!"
}
```
### Get solution
> Returns solution
* URL
<br/>`.../api/solution`
* Method
<br/>`POST`
* Example request
```
{
	"type": "P-8",
	"number1": "x^3 + 2x^2 + 3x + 2",
	"number2": "x^2 + 2x + 1"
}
```
* Example success response
```
{
  "result": "x^{5} + 4x^{4} + 8x^{3} + 10x^{2} + 7x + 2",
  "status": "ok"
}
```
> Warning: Result is returned in LATEX format.
* Example wrong response
```
{
  "status": "error",
  "error": "Bad Request!"
}
```
## License
[MIT](https://github.com/booleanull/PhysicsLeti-Backend/blob/master/LICENSE)
```
MIT License

Copyright (c) 2019 Vitaliy Zub

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
