public class MyArray {
    public void arrayTransformation(String[][]array) throws MyArraySizeException,MyArrayDataException {
        int sum = 0;
        if (array[0].length == 4 && array[1].length == 4 && array[2].length == 4 && array[3].length == 4) {
            for (int i = 0; i < array[0].length; i++) {
                for (int j = 0; j < array[1].length; j++) {
                    try {
                        sum = sum + Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("ошибка преобразования в ячейке"+"[" + i + "," + j + "]");
                    }
                }
            }
        } else {
            throw new MyArraySizeException("Неверный размер массива");
        }
        System.out.printf("сумма элементов равна %s", sum);

    }
}
