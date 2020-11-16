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
    // ÇöÀç ¿ä¼ÒÀÇ °³¼ö°¡ heap_sizeÀÎ È÷ÇÁ h¿¡ itemÀ» »ğÀÔÇÑ´Ù.
    // »ğÀÔ ÇÔ¼ö
    static void insert_min_heap(HeapType h, element item) {
        int i;
        i = ++(h.heap_size);

        //  Æ®¸®¸¦ °Å½½·¯ ¿Ã¶ó°¡¸é¼­ ºÎ¸ğ ³ëµå¿Í ºñ±³ÇÏ´Â °úÁ¤
        while ((i != 1) && (item.key < h.heap[i / 2].key)) {
            h.heap[i] = h.heap[i / 2];
            i /= 2;
        }
        h.heap[i] = item;     // »õ·Î¿î ³ëµå¸¦ »ğÀÔ
    }

    // »èÁ¦ ÇÔ¼ö
    static element delete_min_heap(HeapType h) {
        int parent, child;
        element item = new element(), temp= new element();

        item = h.heap[1];
        temp = h.heap[(h.heap_size)--];
        parent = 1;
        child = 2;
        while (child <= h.heap_size) {
            // ÇöÀç ³ëµåÀÇ ÀÚ½Ä³ëµåÁß ´õ ÀÛÀº ÀÚ½Ä³ëµå¸¦ Ã£´Â´Ù.
            if ((child < h.heap_size) && (h.heap[child].key) > h.heap[child + 1].key)
                child++;
            if (temp.key < h.heap[child].key) break;
            // ÇÑ ´Ü°è ¾Æ·¡·Î ÀÌµ¿
            h.heap[parent] = h.heap[child];
            parent = child;
            child *= 2;
        }
        h.heap[parent] = temp;
        return item;
    }

    // ÀÌÁø Æ®¸® »ı¼º ÇÔ¼ö
    static TreeNode make_tree(TreeNode left, TreeNode right) {
        TreeNode node = new TreeNode();
        node.left = left;
        node.right = right;
        return node;
    }

    // ÀÌÁø Æ®¸® Á¦°Å ÇÔ¼ö
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
            System.out.printf("[%d] ", root.weight);  // ³ëµå ¹æ¹®
            print_tree(root.left);// ¿ŞÂÊ¼­ºêÆ®¸® ¼øÈ¸
            print_tree(root.right);// ¿À¸¥ÂÊ¼­ºêÆ®¸® ¼øÈ¸
        }
    }


    static void print_codes(TreeNode root, int codes[], int top) {

        // 1À» ÀúÀåÇÏ°í ¼øÈ¯È£ÃâÇÑ´Ù.
        if (root.left != null) {
            codes[top] = 1;
            print_codes(root.left, codes, top + 1);
        }

        // 0À» ÀúÀåÇÏ°í ¼øÈ¯È£ÃâÇÑ´Ù.
        if (root.right != null) {
            codes[top] = 0;
            print_codes(root.right, codes, top + 1);
        }

        // ´Ü¸»³ëµåÀÌ¸é ÄÚµå¸¦ Ãâ·ÂÇÑ´Ù.
        if (is_leaf(root)) {
            //printf("inside print \n");
            System.out.printf("%s: ", root.ch);
            //printf("inside print 2 \n");
            print_array(codes, top);
        }
    }

    // ÇãÇÁ¸¸ ÄÚµå »ı¼º ÇÔ¼ö
    static void huffman_tree(int freq[], String ch_list[], int n) {
        //printf("ÇãÇÁ¸¸ÄÚµå µé¾î¿È\n");
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
        //printf("ÇãÇÁ¸¸ÄÚµå for ¿Ï·á \n");
        for (i = 1; i < n; i++) {
            //ÃÖ¼Ò°ªÀ» °¡Áö´Â µÎ°³ÀÇ ³ëµå¸¦ »èÁ¦
            e1 = delete_min_heap(heap);
            e2 = delete_min_heap(heap);
            // µÎ°³ÀÇ ³ëµå¸¦ ÇÕÄ£´Ù.
            x = make_tree(e1.ptree, e2.ptree);
            e.key = x.weight = e1.key + e2.key;
            e.ptree = x;
            System.out.printf("%d+%d->%d \n", e1.key, e2.key, e.key);
            insert_min_heap(heap, e);
        }
        //System.out.printf("ÇãÇÁ¸¸ÄÚµå ÀüºÎ ¿Ï·á \n");

        e = delete_min_heap(heap); // ÃÖÁ¾ Æ®¸®
        //printf("ÇãÇÁ¸¸ÄÚµå delete ¿Ï·á \n");
        print_codes(e.ptree, codes, top);
        //System.out.printf("ÇãÇÁ¸¸ÄÚµå ÀüºÎ ¿Ï·á \n");
        destroy_tree(e.ptree);
    }
    public static void main(String[] args) {
        //char* ch_list[] = { '°¡' ,'°¢' ,'°£' ,'°¤' ,'°¥' ,'°¦' ,'°¨' ,'°©' ,'°ª' ,'°«' ,'°¬' ,'°­' ,
        //	'°®' ,'°¯' ,'°°' ,'°±' ,'°²' ,'°³' ,'°´' ,'°µ' ,'°¶' ,'°·' ,'°¸' ,'°¹' ,'°º' ,'°»' ,'°¼' ,
        //	'°½' ,'°¾' ,'°¿' ,'°Â' ,'°Ã' ,'°Ä' ,'°Å' ,'°Æ' ,'°Ç' ,'°È' ,'°É' ,'°Ë' ,'°Ì' ,'£' ,'°Í' ,
        //	'°Î' ,'°Ï' ,'°Ğ' ,'°Ñ' ,'°Ò' ,'°Ó' ,'°Ô' ,'°Õ' ,'°Ö' ,'°×' ,'°Ø' ,'°Ù' ,'°Ú' ,'°Û' ,'°Ü' ,
        //	'°İ' ,'°Ş' ,'°ß' ,'°à' ,'°á' ,'°â' ,'°ã' ,'°ä' ,'°å' ,'°æ' ,'Æ' ,'°ç' ,'°è' ,'°é' ,'°ê' ,
        //	'°ë' ,'°ì' ,'°í' ,'°î' ,'°ï' ,'°ğ' ,'°ñ' ,'°ò' ,'°ó' ,'°ô' ,'°õ' ,'°ö' ,'°÷' ,'°ø' ,'°ù' ,
        //	'°ú' ,'°û' ,'°ü' ,'°ı' ,'±¡' ,'±¢' ,'±¤' ,'±¥' ,'±¦' ,'±ª' ,'±«' ,'±¬' ,'±­' ,'±®' };
        String ch_list[] = {"°¡", "°¢", "°£", "°¤", "°¥", "°¦", "°¨", "°©", "°ª", "°«", "°¬", "°­", "°®",
                "°¯", "°°", "°±", "°²", "°³", "°´", "°µ", "°¶", "°·", "°¸", "°¹", "°º", "°»", "°¼", "°½", "°¾",
                "°¿", "°Â", "°Ã", "°Ä", "°Å", "°Æ", "°Ç", "°È", "°É", "°Ë", "°Ì", "£", "°Í", "°Î", "°Ï", "°Ğ",
                "°Ñ", "°Ò", "°Ó", "°Ô", "°Õ", "°Ö", "°×", "°Ø", "°Ù", "°Ú", "°Û", "°Ü", "°İ", "°Ş", "°ß", "°à",
                "°á", "°â", "°ã", "°ä", "°å", "°æ", "Æ", "°ç", "°è", "°é", "°ê", "°ë", "°ì", "°í", "°î", "°ï",
                "°ğ", "°ñ", "°ò", "°ó", "°ô", "°õ", "°ö", "°÷", "°ø", "°ù", "°ú", "°û", "°ü", "°ı", "±¡", "±¢",
                "±¤", "±¥", "±¦", "±ª", "±«", "±¬", "±­", "±®"};
        int freq[] = {150918, 18071, 21939, 120, 4705, 15, 11456, 2038, 846, 202, 3225, 10367, 3503,
                33, 14724, 147, 69, 20091, 1953, 28, 63, 6, 6, 90, 2, 264, 121, 2, 1, 70, 256, 17, 2,
                31282, 864, 12970, 523, 6753, 3310, 1182, 4, 58386, 96, 28, 4, 287, 31, 35, 56945, 437,
                104, 12, 9, 9, 8640, 2, 4862, 5889, 615, 3580, 2, 12551, 368, 399, 2, 1002, 25932, 1,
                416, 23653, 1, 1, 2, 11, 152862, 1968, 2105, 1594, 2712, 4, 3, 17, 681, 724, 4581, 21307,
                31, 43685, 265, 21976, 248, 6, 1, 4499, 75, 657, 34, 1348, 1, 10, 1};
        huffman_tree(freq, ch_list, 100);
    }
}
