using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _210129
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String[] items = new string[] {"케시키", "켓세키", "스바시바"};
            checkedListBox1.Items.AddRange(items);
        }

        private void checkedListBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
           /* String item = checkedListBox1.SelectedItem.ToString();
            textBox1.Text += item + "\r\n"; */
        }

        private void button2_Click(object sender, EventArgs e)
        {
           if(checkedListBox1.SelectedIndex  == -1)
            {
                MessageBox.Show("목록에서 선택한 내용이 없습니다. 돌겠다!!!!!!!!!!!!!!");
                return;
            }

            checkedListBox1.Items.RemoveAt(checkedListBox1.SelectedIndex);
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            String[] items = new string[] { "숨막힘", "건조함", "족팡매", "니취팔로마", "될 대로 되라!!!" };
            comboBox1.Items.AddRange(items);
            comboBox1.SelectedIndex = 4;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if(comboBox1.SelectedIndex == -1)
            {
                MessageBox.Show("너무 많아서 대갈통 터질 거 같다.");
                return;
            }

            comboBox1.Items.RemoveAt(comboBox1.SelectedIndex);
        }
    }
}
