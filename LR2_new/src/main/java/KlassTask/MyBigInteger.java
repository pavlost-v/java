package KlassTask;

import java.util.ArrayList;

public class MyBigInteger {
    private ArrayList<Long> arr;

    private final Long MAXLONG = 9999999999L;
    private final Long DELIMETER = MAXLONG + 1;
    private int lastIdx = 0;
    private boolean sign = true;

    public MyBigInteger() {
        arr = new ArrayList<>();
        arr.add(0L);
    }

    public MyBigInteger(Long l) {
        if (l < 0) {
            sign = false;
        }
        arr = new ArrayList<>();
        l = Math.abs(l);
        while (l > 0) {
            Long tmp = l % DELIMETER;
            arr.add(tmp);
            l = l / DELIMETER;
        }
        arr = reverse(arr);

    }

    public static ArrayList<Long> reverse(ArrayList<Long> in) {
        ArrayList<Long> arrNew = new ArrayList<Long>();
        for (int i = in.size() - 1; i >= 0; i--) {
            arrNew.add(in.get(i));
        }
        return arrNew;
    }

    private void add(Long t, int idx) {
        System.out.println(this.sign);
        if (t < 0 && !this.sign || t > 0 && this.sign) {
            System.out.println("LOL");
            Long toAdd = t;
            if (t < 0) {
                toAdd = -t;
            }
            while (idx >= 0) {
                if (arr.get(idx + lastIdx) + toAdd < MAXLONG + 1) {
                    arr.set(idx + lastIdx, arr.get(idx + lastIdx) + toAdd);
                    return;
                } else {
                    arr.set(idx, (arr.get(idx + lastIdx) + toAdd) % (DELIMETER));
                    toAdd = 1L;
                    idx--;
                }
            }
            arr.add(0, 1L);
            lastIdx++;
        } else if (t < 0 && this.sign) {
            if (arr.size() > 1) {
                while (idx > 0) {
                    if (arr.get(idx) + t >= 0) {
                        arr.set(idx, arr.get(idx) + t);
                        return;
                    } else {
                        Long tmp = DELIMETER + arr.get(idx);
                        arr.set(idx, tmp + t);
                        idx--;
                        arr.set(idx, arr.get(idx) - 1);
                        return;
                    }
                }
                if (arr.get(0) + t >= 0) {
                    arr.set(0, arr.get(0) + t);
                    if (arr.get(0) == 0) {
                        arr.remove(0);
                    }
                } else {
                    this.sign = false;
                    arr.set(0, Math.abs(t) - arr.get(0));
                }
            } else {
                Long tmp = arr.get(0) + t;
                if (tmp < 0) {
                    this.sign = false;
                    arr.set(0, Math.abs(tmp));
                } else {
                    arr.set(0, tmp);
                }
            }
        } else if (t > 0 && !this.sign) {
            if (arr.size() > 1) {
                while (idx > 0) {
                    if (arr.get(idx) > t) {
                        arr.set(idx, arr.get(idx) - t);
                        return;
                    } else {
                        Long tmp = DELIMETER + arr.get(idx);
                        arr.set(idx, tmp - t);
                        idx--;
                        arr.set(idx, arr.get(idx) - 1);
                        return;
                    }
                }
                if (arr.get(0) >= t) {
                    arr.set(0, arr.get(0) - t);
                } else {
                    this.sign = true;
                    arr.set(0, t - arr.get(0));
                }
            } else {
                Long tmp = -arr.get(0) + t;
                if (tmp < 0) {
                    arr.set(0, Math.abs(tmp));
                } else {
                    this.sign = true;
                    arr.set(0, tmp);
                }
            }
        }

    }


    public void add(MyBigInteger t) {
        lastIdx = 0;
        if (t.arr.size() > this.arr.size()) {
            for (int i = 0; i < (t.arr.size() - this.arr.size()); i++) {
                this.arr.add(0, 0L);
            }
        } else if (t.arr.size() < this.arr.size()) {
            for (int i = 0; i < (this.arr.size() - t.arr.size()); i++) {
                t.arr.add(0, 0L);
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            Long toAdd = t.arr.get(i);
            if (!t.sign) {
                toAdd = -toAdd;
            }
            this.add(toAdd, i);
        }
    }

    public void add(Long l) {
        if (arr.get(0) == 0 && arr.size() == 1) {
            if (l < 0) {
                this.sign = false;
            } else {
                this.sign = true;
            }
        }
        lastIdx = 0;
        MyBigInteger tmp = new MyBigInteger(l);
        tmp.print();
        this.add(tmp);
    }

    public void print() {
        if (!this.sign) {
            System.out.print("-");
        }


        String result = new String(Long.toString(arr.get(0)));
        for (int i = 1; i < arr.size(); i++) {
            String partResult = new String(Long.toString(arr.get(i)));
            int len = partResult.length();
            if (len != 10) {
                int needZeros = 10 - len;
                String zeros = new String();
                for (int j = 0; j < needZeros; j++) {
                    zeros = zeros.concat("0");
                }
                partResult = zeros + partResult;
            }
            result += partResult;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        MyBigInteger firstNum = new MyBigInteger(Long.MAX_VALUE);
//        firstNum.print();
//        firstNum.add(1L);
//        firstNum.print();
        System.out.println("new");
        MyBigInteger x = new MyBigInteger(1L);
        x.add(2L);
//        x.print();
        x.add(-1L);
//        x.print();
        System.out.println(Long.MAX_VALUE);
        x.add(Long.MAX_VALUE);
        x.print();
        x.add(Long.MIN_VALUE + 1);
        x.add(-2L);
        x.print();
        System.out.println(Long.MIN_VALUE);
        x.add(Long.MIN_VALUE);
        x.print();
    }
}
