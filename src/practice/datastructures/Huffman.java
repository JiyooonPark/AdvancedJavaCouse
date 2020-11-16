class TreeNode {
    int weight;
    String ch;
    TreeNode right, left;
}

class element {
    TreeNode ptree;
    String ch;
    int key;
}

//public static void main()
class HeapType {
    element[] heap;
    int heap_size;

    HeapType() {
        heap = new element[200];
        heap_size = 0;
    }
}

public class Huffman {
    // ���� ����� ������ heap_size�� ���� h�� item�� �����Ѵ�.
    // ���� �Լ�
    static void insert_min_heap(HeapType h, element item) {
        int i;
        i = ++(h.heap_size);

        //  Ʈ���� �Ž��� �ö󰡸鼭 �θ� ���� ���ϴ� ����
        while ((i != 1) && (item.key < h.heap[i / 2].key)) {
            h.heap[i] = h.heap[i / 2];
            i /= 2;
        }
        h.heap[i] = item;     // ���ο� ��带 ����
    }

    // ���� �Լ�
    static element delete_min_heap(HeapType h) {
        int parent, child;
        element item = new element(), temp= new element();

        item = h.heap[1];
        temp = h.heap[(h.heap_size)--];
        parent = 1;
        child = 2;
        while (child <= h.heap_size) {
            // ���� ����� �ڽĳ���� �� ���� �ڽĳ�带 ã�´�.
            if ((child < h.heap_size) && (h.heap[child].key) > h.heap[child + 1].key)
                child++;
            if (temp.key < h.heap[child].key) break;
            // �� �ܰ� �Ʒ��� �̵�
            h.heap[parent] = h.heap[child];
            parent = child;
            child *= 2;
        }
        h.heap[parent] = temp;
        return item;
    }

    // ���� Ʈ�� ���� �Լ�
    static TreeNode make_tree(TreeNode left, TreeNode right) {
        TreeNode node = new TreeNode();
        node.left = left;
        node.right = right;
        return node;
    }

    // ���� Ʈ�� ���� �Լ�
    static void destroy_tree(TreeNode root) {
        if (root == null) return;
        destroy_tree(root.left);
        destroy_tree(root.right);
    }

    static boolean is_leaf(TreeNode root) {
        if(root.left == null && root.right== null)
            return true;
        else return false;

    }

    static void print_array(int codes[], int n) {
        for (int i = 0; i < n; i++)
            System.out.printf("%d", codes[i]);
        System.out.print("\n");
    }

    void print_tree(TreeNode root) {
        if (root != null) {
            System.out.printf("[%d] ", root.weight);  // ��� �湮
            print_tree(root.left);// ���ʼ���Ʈ�� ��ȸ
            print_tree(root.right);// �����ʼ���Ʈ�� ��ȸ
        }
    }


    static void print_codes(TreeNode root, int codes[], int top) {

        // 1�� �����ϰ� ��ȯȣ���Ѵ�.
        if (root.left != null) {
            codes[top] = 1;
            print_codes(root.left, codes, top + 1);
        }

        // 0�� �����ϰ� ��ȯȣ���Ѵ�.
        if (root.right != null) {
            codes[top] = 0;
            print_codes(root.right, codes, top + 1);
        }

        // �ܸ�����̸� �ڵ带 ����Ѵ�.
        if (is_leaf(root)) {
            //printf("inside print \n");
            System.out.printf("%s: ", root.ch);
            //printf("inside print 2 \n");
            print_array(codes, top);
        }
    }

    // ������ �ڵ� ���� �Լ�
    static void huffman_tree(int freq[], String ch_list[], int n) {
        //printf("�������ڵ� ����\n");
        int i;
        TreeNode node, x;
        HeapType heap = new HeapType();
        element e = new element(), e1= new element(), e2= new element();
        int codes[] = new int[0];
        int top = 0;


        for (i = 0; i < n; i++) {
            node = make_tree(null, null);
            e.ch = ch_list[i];
            node.ch = ch_list[i];
            e.key = freq[i];
            node.weight = freq[i];
            e.ptree = node;
            insert_min_heap(heap, e);
        }
        //printf("�������ڵ� for �Ϸ� \n");
        for (i = 1; i < n; i++) {
            //�ּҰ��� ������ �ΰ��� ��带 ����
            e1 = delete_min_heap(heap);
            e2 = delete_min_heap(heap);
            // �ΰ��� ��带 ��ģ��.
            x = make_tree(e1.ptree, e2.ptree);
            e.key = x.weight = e1.key + e2.key;
            e.ptree = x;
            System.out.printf("%d+%d->%d \n", e1.key, e2.key, e.key);
            insert_min_heap(heap, e);
        }
        //System.out.printf("�������ڵ� ���� �Ϸ� \n");

        e = delete_min_heap(heap); // ���� Ʈ��
        //printf("�������ڵ� delete �Ϸ� \n");
        print_codes(e.ptree, codes, top);
        //System.out.printf("�������ڵ� ���� �Ϸ� \n");
        destroy_tree(e.ptree);
    }
    public static void main(String[] args) {
        //char* ch_list[] = { '��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,
        //	'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,
        //	'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,
        //	'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,
        //	'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,
        //	'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,
        //	'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' ,'��' };
        String ch_list[] = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
                "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
                "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
                "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
                "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
                "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
                "��", "��", "��", "��", "��", "��", "��", "��"};
        int freq[] = {150918, 18071, 21939, 120, 4705, 15, 11456, 2038, 846, 202, 3225, 10367, 3503,
                33, 14724, 147, 69, 20091, 1953, 28, 63, 6, 6, 90, 2, 264, 121, 2, 1, 70, 256, 17, 2,
                31282, 864, 12970, 523, 6753, 3310, 1182, 4, 58386, 96, 28, 4, 287, 31, 35, 56945, 437,
                104, 12, 9, 9, 8640, 2, 4862, 5889, 615, 3580, 2, 12551, 368, 399, 2, 1002, 25932, 1,
                416, 23653, 1, 1, 2, 11, 152862, 1968, 2105, 1594, 2712, 4, 3, 17, 681, 724, 4581, 21307,
                31, 43685, 265, 21976, 248, 6, 1, 4499, 75, 657, 34, 1348, 1, 10, 1};
        huffman_tree(freq, ch_list, 100);
    }
}
