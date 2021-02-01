using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _2._1
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
            listBox1.Items.Add("티끌 모아 티끌");
            listBox1.Items.Add("가랑비에 옷이 많이 젖지는 않는다.");
            listBox1.Items.Add("일찍 일어나는 벌레가 잡아 먹힌다.");
            listBox1.Items.Add("늦었다고 생각했을 때가 진짜 늦은 것이다.");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (listBox1.SelectedIndex == -1)
            {
                MessageBox.Show("모르겠다. 될 대로 되라!!");
            }else
            {
                listBox1.Items.RemoveAt(listBox1.SelectedIndex);
            }
        }
    }
}
