class Solution {
    static int freq[]=new int[128];
    static void initialize()
    {
        for(char c = '0'; c<='9'; c++)
            freq[c]=0;
    }
    public boolean isValidSudoku(char[][] board) {
        initialize();
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                freq[board[i][j]]++;
                if(freq[board[i][j]]>1&&board[i][j]!='.')
                    return false;
            }
            initialize();
        }
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
            initialize();
        }
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        initialize();
        for(int i=0; i<3; i++)
        {
            for(int j=3; j<6; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        initialize();
        for(int i=0; i<3; i++)
        {
            for(int j=6; j<9; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        initialize();
        for(int i=3; i<6; i++)
        {
            for(int j=0; j<3; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        initialize();
        for(int i=3; i<6; i++)
        {
            for(int j=3; j<6; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        initialize();
        for(int i=3; i<6; i++)
        {
            for(int j=6; j<9; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        initialize();
        for(int i=6; i<9; i++)
        {
            for(int j=0; j<3; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        initialize();
        for(int i=6; i<9; i++)
        {
            for(int j=3; j<6; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        initialize();
        for(int i=6; i<9; i++)
        {
            for(int j=6; j<9; j++)
            {
                freq[board[j][i]]++;
                if(freq[board[j][i]]>1&&board[j][i]!='.')
                    return false;
            }
        }
        return true;
    }
}