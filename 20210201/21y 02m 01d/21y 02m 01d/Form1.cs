using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _21y_02m_01d
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (checkBox1.Checked == true)
            {
                label1.Text = textBox1.Text;
                listBox1.Items.Add(textBox1.Text);
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            listBox1.Items.Add("켓세키");
            listBox1.Items.Add("케시키");
            listBox1.Items.Add("씨벨롬");
            listBox1.Items.Add("스바시바");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (listBox1.SelectedIndex == -1)
            {
                MessageBox.Show("딴 데가서 알아봐라!!!");
            }else
            {
                listBox1.Items.RemoveAt(listBox1.SelectedIndex);
            }
        }
    }
}
