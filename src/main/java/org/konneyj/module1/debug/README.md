1. Внесена ошибка на 22 строке: выражение "i = n - 1" заменено на выражение "i = n"
2. В процессе выполнения программы появляется ошибка  

   Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
   at org.konneyj.module1.debug.BubbleSortedDebugger.main(BubbleSortedDebugger.java:24)
3. Ставлю точку остановы на 22 строке и запускаю программу в режиме Debug
4. С помощью кнопки StepOver(F8) прохожусь по циклу
5. Ошибка возникает на последней итерации вложенного цикла
6. Проверяю граничные значения переменных итерирования обоих циклов
7. Нахожу ошибку в неправильном начальном значении переменной итерирования i