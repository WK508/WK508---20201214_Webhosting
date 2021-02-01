using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _20210201
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = "LAD";
            textBox1.Text = "LAD";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            label1.Text = "TB";
            textBox1.Text = "TB";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            label1.Text = "ATL";
            textBox1.Text = "ATL";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            label1.Text = "HOU";
            textBox1.Text = "HOU";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            label1.Text = "SD";
            textBox1.Text = "SD";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            label1.Text = "OAK";
            textBox1.Text = "OAK";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            label1.Text = "NYY";
            textBox1.Text = "NYY";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            label1.Text = "MIA";
            textBox1.Text = "MIA";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            label1.Text = "CHC";
            textBox1.Text = "CHC";
        }
    }
}
