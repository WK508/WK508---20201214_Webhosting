using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _21._01._29
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String[] items = new string[] { "조온마난색기", "시발노무색기", "씨벨롬", "스바시바", "켓세키" };
            checkedListBox1.Items.AddRange(items);
        }

        private void checkedListBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
           /* String item = checkedListBox1.SelectedItem.ToString();
            textBox1.Text += item + "\r\n"; */
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if(checkedListBox1.SelectedIndex == -1)
            {
                MessageBox.Show("아무것도 없다. 딴 데 가서 알아봐라.");
                return;
            }

            checkedListBox1.Items.RemoveAt(checkedListBox1.SelectedIndex);
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            String[] items = new string[] { "시카고 컵스", "휴스턴 애스트로스", "보스턴 레드삭스",
                "워싱턴 내셔널스", "LA 다저스" };
            comboBox1.Items.AddRange(items);
            comboBox1.SelectedIndex = 4;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (comboBox1.SelectedIndex == -1)
            {
                MessageBox.Show("아 돌겠네 진짜!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                return;
            }

            comboBox1.Items.RemoveAt(comboBox1.SelectedIndex);
        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            System.Diagnostics.Process.Start("http://www.naver.com");
        }

        private void checkedListBox1_ItemCheck(object sender, ItemCheckEventArgs e)
        {
            textBox1.Text += "index : "+ e.Index + ", " + "value : " + e.NewValue;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < checkedListBox1.CheckedItems.Count; i++)
            {
                textBox1.Text += "checked : " +
                    checkedListBox1.CheckedItems[i] + 
                    "\r\n";
            }
        }
    }
}
